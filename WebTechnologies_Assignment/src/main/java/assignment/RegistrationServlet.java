package assignment;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.regex.Pattern;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate form fields
        boolean isValid = true;
        StringBuilder errorMessages = new StringBuilder();

        // Validate first name (only alphabets)
        if (!Pattern.matches("[a-zA-Z]+", firstName)) {
            isValid = false;
            errorMessages.append("First Name should contain only alphabets.<br>");
        }

        // Validate last name (only alphabets)
        if (!Pattern.matches("[a-zA-Z]+", lastName)) {
            isValid = false;
            errorMessages.append("Last Name should contain only alphabets.<br>");
        }

        // Validate mobile number (10 digits)
        if (!Pattern.matches("\\d{10}", mobile)) {
            isValid = false;
            errorMessages.append("Mobile should contain exactly 10 digits.<br>");
        }

        // Validate email (standard email format)
        if (!Pattern.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b", email)) {
            isValid = false;
            errorMessages.append("Invalid Email format.<br>");
        }

        // Validate password (at least 1 uppercase, 1 lowercase, 1 digit, 1 special character)
        if (!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%_&])[A-Za-z\\d@#$%_&]{8,}$", password)) {
            isValid = false;
            errorMessages.append("Password should have at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@, #, $, %, _, &).<br>");
        }

        if (isValid) {
            // Perform registration logic or database CRUD operations here
            // ...

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html><body>");
            out.println("<h2>Registration Successful</h2>");
            out.println("<p>First Name: " + firstName + "</p>");
            out.println("<p>Last Name: " + lastName + "</p>");
            out.println("<p>Mobile: " + mobile + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("</body></html>");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html><body>");
            out.println("<h2>Registration Failed</h2>");
            out.println("<p>" + errorMessages.toString() + "</p>");
            out.println("</body></html>");
        }
    }
}

