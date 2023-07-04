<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Student</title>
</head>
<body>
    <h2>View Student</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Street</th>
            <th>City</th>
            <th>State</th>
            <th>Zip Code</th>
        </tr>
        <tr>
            <td>${student.studentId}</td>
            <td>${student.studentName}</td>
            <td>${student.address.street}</td>
            <td>${student.address.city}</td>
            <td>${student.address.state}</td>
            <td>${student.address.zipCode}</td>
        </tr>
    </table>
    <br>
    <a href="index.jsp">Back to List</a>
</body>
</html>
