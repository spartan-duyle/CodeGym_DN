<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 84354
  Date: 7/15/2022
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Student</title>
</head>
<body>
<table class="table" border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Gender</th>
        <th>Languages</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
    <tr>
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.gender}</td>
        <td>
            <c:forEach var="language" items="${student.languages}">
                ${language}
            </c:forEach>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
