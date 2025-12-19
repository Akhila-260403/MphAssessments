<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Login</title>
</head>
<body>
 
<h2>Admin Login</h2>
 
<form action="adminLogin" method="post">
 
    <label>Email:</label><br>
    <input type="email" name="email" required><br><br>
 
    <label>Password:</label><br>
    <input type="password" name="password" required><br><br>
 
    <input type="submit" value="Login">
 
</form>
 
</body>
</html>