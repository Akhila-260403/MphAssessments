<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Question</title>
</head>
<body>
 
<h2>Add New Question</h2>
 
<form action="addQuestion" method="post">
 
    <label>Question:</label><br>
    <textarea name="questionText" rows="3" cols="50" required></textarea><br><br>
 
    <label>Option A:</label><br>
    <input type="text" name="optionA" required><br><br>
 
    <label>Option B:</label><br>
    <input type="text" name="optionB" required><br><br>
 
    <label>Option C:</label><br>
    <input type="text" name="optionC" required><br><br>
 
    <label>Option D:</label><br>
    <input type="text" name="optionD" required><br><br>
 
    <label>Correct Option:</label><br>
    <select name="correctOption" required>
        <option value="">--Select--</option>
        <option value="A">A</option>
        <option value="B">B</option>
        <option value="C">C</option>
        <option value="D">D</option>
    </select><br><br>
 
    <input type="submit" value="Add Question">
 
</form>
 
</body>
</html>