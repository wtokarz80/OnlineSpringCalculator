<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring calculator</title>
</head>
<body>
<h1>Spring calculator</h1>
<form method="post">
    <input name="valueA" type="number" /> <br />
    <input name="valueB" type="number" /> <br />
    <select name="operator" id="operator">
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
    </select>
    <input type="submit" value="Enter">
</form>
</body>
</html>
