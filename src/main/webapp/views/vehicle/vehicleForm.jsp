<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 30/07/2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création d'un véhicule</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/traitementForm" method="post">
    <h3>Veuillez renseigner les champs pour créer un véhicule</h3>
    <ul>
        <li>
            <label for="brand">Marque:</label>
            <input type="text" id="brand" name="brand" />
        </li>
        <li>
            <label for="model">Model:</label>
            <input type="text" id="model" name="model" />
        </li>
        <li>
            <label for="year">Année:</label>
            <input type="text" id="year" name="year" />
        </li>
        <li>
            <label for="color">Couleur:</label>
            <input type="text" id="color" name="color" />
        </li>
        <li>
            <label for="places">Places:</label>
            <input type="text" id="places" name="places" />
        </li>
    </ul>

    <div>
        <button type="submit">Créer le véhicule</button>
    </div>

</form>
</body>
</html>
