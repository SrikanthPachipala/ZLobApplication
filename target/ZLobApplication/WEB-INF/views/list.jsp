<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head><title>List</title></head>
<body>
    <h2>People List</h2>
    <table border="1">
        <tr>
            <th>ID</th><th>Name</th><th>City</th>
        </tr>
        <c:forEach var="person" items="${people}">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.city}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
