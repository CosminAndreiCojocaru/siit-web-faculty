<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Enrollment</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Enrollment for ${student.name}&nbsp;&nbsp;
        <a href="<c:url value="/students"/>" class="btn btn-primary">Back to Students List</a></h2>
    <table class="table table-striped">
        <tr>
            <th>batchid</th>
            <th>edate</th>
        </tr>
        <c:forEach items="${student.enrollments}" var="enrollment">
        <tr>
            <td><c:out value="${enrollment.batchid}"/></td>
            <td><c:out value="${enrollment.edate}"/></td>
        </tr>
        </c:forEach>

</table>
</div>

</body>
</html>
