<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Management</title>
</head>
<body>
    <h2>Student List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>
                    <a href="StudentServlet?action=view&studentId=${student.studentId}">View</a>
                    <a href="StudentServlet?action=edit&studentId=${student.studentId}">Edit</a>
                    <a href="StudentServlet?action=delete&studentId=${student.studentId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="add.jsp">Add Student</a>
</body>
</html>
