<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<%@ include file="partials/navbar.html"%>
<%--    <c:if test="true">--%>
<%--        <h1>Variable names should be very descriptive</h1>--%>
<%--    </c:if>--%>
<%--    <c:if test="false">--%>
<%--        <h1>single letter variable names are good</h1>--%>
<%--    </c:if>--%>

<%! String[] name = {"Xavier", "Joe", "John"};%>
<%! int count = 0; %>
<%--<h1><%= Arrays.toString(name) %></h1>--%>
<h1><%= count++ %></h1>

<% String cohort = request.getParameter("cohort"); %>
<%--<%= cohort %>--%>

<%--shorthand--%>
${param.cohort.toUpperCase()} is awesome!

<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
