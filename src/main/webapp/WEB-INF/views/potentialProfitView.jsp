<%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 09.08.2021
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="salesman" action="/salesman/potential">
    Select a salesman:
    <select name="idSalesman">
        <c:forEach items="${salesmen}" var="salesman">
            <option value="${salesman.id}"> ${salesman.name}</option>
        </c:forEach>
    </select>
    <br><input type="submit" value="Show possible profit">
</form:form>
</body>
</html>
