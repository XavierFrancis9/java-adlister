<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/19/23
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h2>Ads</h2>
    <div>
        <c:forEach var="ad" items="${ads}">
            <div class="card">
                <h3>${ad.title}</h3>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>
</body>
</html>
