<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h2>Add Student</h2>
    <form action="StudentServlet" method="post">
        <input type="hidden" name="action" value="add">
        <label for="studentName">Name:</label>
        <input type="text" id="studentName" name="studentName" required><br><br>
        <label for="street">Street:</label>
        <input type="text" id="street" name="street" required><br><br>
        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br><br>
        <label for="state">State:</label>
        <input type="text" id="state" name="state" required><br><br>
        <label for="zipCode">Zip Code:</label>
        <input type="text" id="zipCode" name="zipCode" required><br><br>
        <input type="submit" value="Add Student">
    </form>
</body>
</html>
