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
<h2>Result: <span><%=(Integer) request.getAttribute("result")%></span></h2>
</body>
</html>