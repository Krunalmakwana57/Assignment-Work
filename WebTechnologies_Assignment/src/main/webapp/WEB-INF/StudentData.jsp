<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <form action="StudentServlet" method="POST">
        <label for="fname">First Name:</label>
        <input type="text" id="fname" name="fname"><br><br>
        
        <label for="lname">Last Name:</label>
        <input type="text" id="lname" name="lname"><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email"><br><br>
        
        <label for="mobile">Mobile:</label>
        <input type="text" id="mobile" name="mobile"><br><br>
        
        <label for="gender">Gender:</label>
        <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
        </select><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
