<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/18/23
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
  <title>Outcome</title>
</head>
<body>
<h1><%= request.getAttribute("message") %></h1>
<form method="GET" action="/guess">
  <button type="submit">Play Again</button>
</form>
</body>
</html>
