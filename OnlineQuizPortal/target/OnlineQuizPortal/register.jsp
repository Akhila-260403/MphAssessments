<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
 
   <!--  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
 
        .container {
            width: 350px;
            margin: 80px auto;
            background: white;
            padding: 20px;
            border-radius: 6px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
 
        h2 {
            text-align: center;
        }
 
        input {
            width: 100%;
            padding: 8px;
            margin-top: 6px;
        }
 
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            margin-top: 15px;
            cursor: pointer;
        }
 
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style> -->
 
</head>
<body>
 
<div class="container">
    <h2>User Registration</h2>
 
    <form action="register" method="post">
 
        <label>Name</label>
        <input type="text" name="name" required>
 
        <label>Email</label>
        <input type="email" name="email" required>
 
        <label>Password</label>
        <input type="password" name="password" required>
 
        <input type="submit" value="Register">
 
    </form>
</div>
 
</body>
</html>
 