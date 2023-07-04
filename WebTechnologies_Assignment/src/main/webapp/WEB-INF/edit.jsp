<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Student</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>Edit Student</h2>
        <form action="StudentServlet?action=update" method="POST">
            <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" value="<%= student.getFirstName() %>" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" value="<%= student.getLastName() %>" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" value="<%= student.getEmail() %>" required>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" class="form-control" id="mobile" name="mobile" value="<%= student.getMobile() %>" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <div class="radio">
                    <label><input type="radio" name="gender" value="Male" <%= student.getGender().equals("Male") ? "checked" : "" %>>Male</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name="gender" value="Female" <%= student.getGender().equals("Female") ? "checked" : "" %>>Female</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary">Update</button>
        </form>
    </div>
</body>
</html>
