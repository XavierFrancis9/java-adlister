<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/18/23
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
  <title>Guess a Number</title>
</head>
<body>
<form method="POST" action="/guess">
  <label for="numberInput">Guess a number between 1 and 3:</label>
  <input type="number" id="numberInput" name="guess" min="1" max="3">
  <button type="submit">Submit</button>
</form>
</body>
</html>
