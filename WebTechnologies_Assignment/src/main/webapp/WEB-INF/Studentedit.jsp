<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
</head>
<body>
    <h2>Edit Student</h2>
    <form action="StudentServlet" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="studentId" value="${student.studentId}">
        <label for="studentName">Name:</label>
        <input type="text" id="studentName" name="studentName" value="${student.studentName}" required><br><br>
        <label for="street">Street:</label>
        <input type="text" id="street" name="street" value="${student.address.street}" required><br><br>
        <label for="city">City:</label>
        <input type="text" id="city" name="city" value="${student.address.city}" required><br><br>
        <label for="state">State:</label>
        <input type="text" id="state" name="state" value="${student.address.state}" required><br><br>
        <label for="zipCode">Zip Code:</label>
        <input type="text" id="zipCode" name="zipCode" value="${student.address.zipCode}" required><br><br>
        <input type="submit" value="Update Student">
    </form>
</body>
</html>
