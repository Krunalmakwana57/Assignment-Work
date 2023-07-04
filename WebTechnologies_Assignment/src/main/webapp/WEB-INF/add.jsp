<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script>
        // Client-side validation using jQuery
        $(document).ready(function() {
            $("#addForm").submit(function(e) {
                var valid = true;
                
                var firstName = $("#firstName").val();
                var lastName = $("#lastName").val();
                var email = $("#email").val();
                var mobile = $("#mobile").val();
                var gender = $("input[name='gender']:checked").val();
                var password = $("#password").val();
                
                // Validate first name (only alphabets)
                if (!/^[a-zA-Z]+$/.test(firstName)) {
                    $("#firstNameError").text("First Name should contain only alphabets");
                    valid = false;
                } else {
                    $("#firstNameError").text("");
                }
                
                // Validate last name (only alphabets)
                if (!/^[a-zA-Z]+$/.test(lastName)) {
                    $("#lastNameError").text("Last Name should contain only alphabets");
                    valid = false;
                } else {
                    $("#lastNameError").text("");
                }
                
                // Validate email (standard email format)
                if (!/^[\w.-]+@[\w.-]+\.[a-zA-Z]{2,}$/.test(email)) {
                    $("#emailError").text("Invalid Email format");
                    valid = false;
                } else {
                    $("#emailError").text("");
                }
                
                // Validate mobile number (10 digits)
                if (!/^\d{10}$/.test(mobile)) {
                    $("#mobileError").text("Mobile should contain exactly 10 digits");
                    valid = false;
                } else {
                    $("#mobileError").text("");
                }
                
                // Validate password (at least 1 uppercase, 1 lowercase, 1 digit, 1 special character)
                if (!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%_&])[A-Za-z\d@#$%_&]{8,}$/.test(password)) {
                    $("#passwordError").text("Password should have at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@, #, $, %, _, &)");
                    valid = false;
                } else {
                    $("#passwordError").text("");
                }
                
                if (!valid) {
                    e.preventDefault(); // Prevent form submission if validation fails
                }
            });
        });
    </script>
</head>
<body>
    <div class="container">
        <h2>Add Student</h2>
        <form id="addForm" action="StudentServlet?action=add" method="POST">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required>
                <div id="firstNameError" class="text-danger"></div>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required>
                <div id="lastNameError" class="text-danger"></div>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <div id="emailError" class="text-danger"></div>
            </div>
            <div class="form-group">
                <label for="mobile">Mobile:</label>
                <input type="text" class="form-control" id="mobile" name="mobile" required>
                <div id="mobileError" class="text-danger"></div>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <div class="radio">
                    <label><input type="radio" name="gender" value="Male" checked>Male</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name="gender" value="Female">Female</label>
                </div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
                <div id="passwordError" class="text-danger"></div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>
