<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/18/23
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
  <title>View Color</title>
  <style>
    body {
      background-color: <%= request.getParameter("color") %>;
    }
  </style>
</head>
<body>
<h1>Your selected color: <%= request.getParameter("color") %></h1>
</body>
</html>
