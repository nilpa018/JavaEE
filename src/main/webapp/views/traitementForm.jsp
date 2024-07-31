<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<jsp:useBean id="vehicles_List" scope="request" type="Entity.Vehicles"/>--%>
<%--<jsp:useBean id="vehicule" scope="request" type="Entity.Vehicles"/>--%>
<%@ page import = "Entity.Vehicles" %>
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
    <title>Détail du véhicule ajouté</title>
</head>
<body>
<h3>Dernier véhicule ajouté :</h3><br>
    ${vehicule}
<br><br>
<b>Liste des véhicules :</b>
    <ul>
        <c:forEach var="item" items="${vehicleList}">
            <li>${item}</li>
        </c:forEach>
    </ul>
</body>
</html>