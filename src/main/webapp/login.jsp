<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/17/23
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<form action="profile.jsp" method="POST">
    <label for="username">Username: </label>
    <input type="text" name="username" id="username">
    <label for="password">Password: </label>
    <input type="password" name="password" id="password">
    <button type="submit">Submit</button>
</form>

<c:choose>
    <c:when test="${param.username.equalsIgnoreCase('admin')}">
        <%=response.sendRedirect("http://localhost:8080/login.jsp")%>
    </c:when>
</c:choose>
</body>
</html>
