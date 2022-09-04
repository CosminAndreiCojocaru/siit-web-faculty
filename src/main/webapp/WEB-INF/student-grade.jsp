<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>GradePoint</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>GradePoint for ${student.name}&nbsp;&nbsp;
        <a href="<c:url value="/students"/>" class="btn btn-primary">Back to Students List</a></h2>
    <table class="table table-striped">
        <tr>
            <th>GradePointAverage</th>
            <th>subject</th>
        </tr>
        <c:forEach items="${student.studentGradePoints}" var="grade">
            <tr>
                <td><c:out value="${grade.gradpointaverage}"/></td>
                <td><c:out value="${grade.subject}"/></td>
                <td>
                    <a href="<c:url value="/students/${student.id}/studentgradepoints/teacher"/> " class="btn btn-info">Teacher</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
