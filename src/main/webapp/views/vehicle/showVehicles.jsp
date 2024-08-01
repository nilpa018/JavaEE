<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 31/07/2024
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "Entity.Vehicles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listing des véhicules</title>
</head>
<body>
<jsp:include page="../layout/menu.jsp" />
<table>
    <tr>
        <th>ID</th>
        <th>Brand</th>
        <th>Model</th>
        <th>Year</th>
        <th>Color</th>
        <th>Places</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="item" items="${vehiclesList}">
    <tr>
        <th>${item.id}</th>
        <td>${item.brand}</td>
        <td>${item.model}</td>
        <td>${item.year}</td>
        <td>${item.color}</td>
        <td>${item.places}</td>
        <td>
            <form action="<%= request.getContextPath() %>/vehicle/delete" method="post">
            <input type="hidden" id="id" name="id" value="${item.id}" />
                <button type="submit">X</button>
            </form>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
