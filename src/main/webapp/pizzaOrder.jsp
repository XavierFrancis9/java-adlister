<%--
  Created by IntelliJ IDEA.
  User: xavierfrancis
  Date: 5/17/23
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h2>Pizza Order Form</h2>
<form method="post" action="pizza-order">
    <label for="crust">Crust Type:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="stuffed">Stuffed</option>
    </select><br><br>

    <label for="sauce">Sauce Type:</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato</option>
        <option value="pesto">Pesto</option>
        <option value="bbq">BBQ</option>
    </select><br><br>

    <label for="size">Size Type:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
    <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
    <input type="checkbox" name="toppings" value="onions">Onions<br>
    <input type="checkbox" name="toppings" value="bell peppers">Bell Peppers<br><br>

    <label for="address">Delivery Address:</label>
    <input type="text" name="address" id="address" required><br><br>

    <input type="submit" value="Submit Order">
</form>
</body>
</html>

