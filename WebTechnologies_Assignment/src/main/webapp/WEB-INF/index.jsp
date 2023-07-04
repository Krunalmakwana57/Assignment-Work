<%@page import="assignment.StudentServlet"%>
<%@page import="assignment.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>Student List</h2>
        <table class="table table-striped">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Gender</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <%
                // Retrieve the list of students from the servlet
                List<Student> studentList = StudentServlet.getStudents();

                for (Student student : studentList) {
            %>
            <tr>
                <td><%= student.getId() %></td>
                <td><%= student.getFirstName() %></td>
                <td><%= student.getLastName() %></td>
                <td><%= student.getEmail() %></td>
                <td><%= student.getMobile() %></td>
                <td><%= student.getGender() %></td>
                <td><a href="edit.jsp?id=<%= student.getId() %>">Edit</a></td>
                <td><a href="StudentServlet?id=<%= student.getId() %>&action=delete">Delete</a></td>
            </tr>
            <%
                }
            %>
        </table>
        <a href="add.jsp" class="btn btn-primary">Add Student</a>
    </div>
</body>
</html>
