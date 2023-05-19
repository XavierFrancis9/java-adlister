<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/18/23
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="partials/beanCSS.jsp"%>
</head>
<body>
<section>
    <div class="container">
        <h2>Albums</h2>
        <c:forEach var="album" items="${albums}">
            <div class="card">
                <h3>${album.getAlbum_name()}</h3>
                <p>Artist: ${album.getArtist_name()}</p>
                <p>Genre: ${album.getGenre()}</p>
                <p>Sales(millions): ${album.getSales()}</p>
            </div>
        </c:forEach>
    </div>
    <div class="container">
        <h2>Quotes</h2>
        <c:forEach var="quote" items="${quotes}">
            <div class="card">
                <h3>${quote.author.first_name} ${quote.author.last_name}</h3>
                <p>"${quote.content}"</p>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
