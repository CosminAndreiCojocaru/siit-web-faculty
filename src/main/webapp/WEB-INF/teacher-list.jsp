<%--
  Created by IntelliJ IDEA.
  User: MLG Y520
  Date: 31.08.2022
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Teachers</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<h2>Teachers
    <a href="<c:url value="/students"/>" class="btn btn-primary">Back to Students List</a></h2>

<table class="table table-striped">
    <tr>
        <th>Name</th>
        <th>Birthday</th>
        <th>Department</th>
        <th>Date of join</th>
        <th>Salary</th>
        <th>Sex</th>
    </tr>

    <c:forEach items="${teachers}" var="teacher">
        <tr>

            <td><c:out value="${teacher.name}"/></td>
            <td><c:out value="${teacher.birthday}"/></td>
            <td><c:out value="${teacher.department}"/></td>
            <td><c:out value="${teacher.dateofjoin}"/></td>
            <td><c:out value="${teacher.salary}"/></td>
            <td><c:out value="${teacher.sex}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
