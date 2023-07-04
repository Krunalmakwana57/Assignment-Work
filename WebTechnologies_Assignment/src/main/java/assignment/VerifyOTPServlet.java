package assignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyOTPServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String enteredOTP = request.getParameter("otp");

        // Retrieve the actual OTP sent to the user's email and compare it with the entered OTP

        if (enteredOTP.equals(actualOTP)) {
            // OTP is valid, mark the user as verified in the database
            // Redirect to the login page
            response.sendRedirect("login.html");
        } else {
            // OTP is invalid, show an error message or redirect to an error page
            response.sendRedirect("error.html");
        }
    }
}

