<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>The student with id ${student.id}&nbsp;&nbsp;
        <a href="<c:url value="/students"/>" class="btn btn-primary">Back to Students List</a></h2>
    <table class="table table-striped">
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Birthday</th>
            <th>City</th>
            <th>Qualification</th>
            <th>Actions</th>

        </tr>
        <c:forEach items="${student.search}" var="student">
        <tr>
            <td><c:out value="${student.name}"/></td>
            <td><c:out value="${student.phone}"/></td>
            <td><c:out value="${student.email}"/></td>
            <td><c:out value="${student.date}"/></td>
            <td><c:out value="${student.city}"/></td>
            <td><c:out value="${student.qualification}"/></td>
            <td>
                <a href="<c:url value="/students/${student.id}/enrollments"/> " class="btn btn-info">Enrollment</a>
                <a href="<c:url value="/students/${student.id}/batches"/> " class="btn btn-info">Batch</a>
                <a href="<c:url value="/students/${student.id}/studentgradepoints"/> " class="btn btn-info">GradePointAverage</a>
            </td>
        </tr>
        </c:forEach>
</div>
</body>
</html>
