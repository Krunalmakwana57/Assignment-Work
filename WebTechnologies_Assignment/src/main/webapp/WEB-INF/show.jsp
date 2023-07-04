<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>Student Details</h2>
        <table class="table">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Gender</th>
            </tr>
            <tr>
                <td><%= student.getId() %></td>
                <td><%= student.getFirstName() %></td>
                <td><%= student.getLastName() %></td>
                <td><%= student.getEmail() %></td>
                <td><%= student.getMobile() %></td>
                <td><%= student.getGender() %></td>
            </tr>
        </table>
        <a href="index.jsp" class="btn btn-primary">Back to List</a>
    </div>
</body>
</html>
