<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Students</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>

<body>
<div class="page-header">
    <div class="pull-left">
        Welcome ! This is a list of all students.
        <a href="<c:url value="/login"/>" class="btn btn-primary">Logout</a>
        <a href="<c:url value="/teachers"/> " class="btn btn-primary">Teachers</a>

    </div>
    <div class="clearfix"></div>
</div>
<link rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<form th:action="@{/students/search}" method="get">
    <input type="number" id="students" placeholder="Search..." name="id">
    <button type="submit"><i class="fa fa-search"></i></button>
</form>


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
    <c:forEach items="${students}" var="student">
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
</table>
</body>
</html>


