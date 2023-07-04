<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>OTP Verification</title>
</head>
<body>
    <h1>OTP Verification</h1>
    <form action="VerifyOTPServlet" method="post">
        <input type="text" name="otp" placeholder="Enter OTP" required><br>
        <button type="submit">Verify OTP</button>
    </form>
</body>
</html>
