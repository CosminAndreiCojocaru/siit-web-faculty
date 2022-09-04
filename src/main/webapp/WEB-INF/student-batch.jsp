
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Batch</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h2>Batch for ${student.name}&nbsp;&nbsp;
        <a href="<c:url value="/students"/>" class="btn btn-primary">Back to Students List</a></h2>

    <table class="table table-striped">
        <tr>
            <th>batchid</th>
            <th>bstrength</th>
        </tr>
        <c:forEach items="${student.batches}" var="batch">
            <tr>
                <td><c:out value="${batch.batchid}"/></td>
                <td><c:out value="${batch.bstrength}"/></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
