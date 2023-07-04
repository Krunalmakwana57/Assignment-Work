package assignment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Perform server-side validation and authenticate the user

        if (authenticated) {
            // Create a session for the user and store their information
            request.getSession().setAttribute("email", email);

            // Redirect to the user's profile page or dashboard
            response.sendRedirect("profile.html");
        } else {
            // Authentication failed, show an error message or redirect to an error page
            response.sendRedirect("error.html");
        }
    }
}

