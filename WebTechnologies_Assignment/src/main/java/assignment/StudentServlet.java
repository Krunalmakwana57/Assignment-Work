package assignment;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Print data in console
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Password: " + password);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Display a message on the webpage
        out.println("<html><body>");
        out.println("<h2>Student Information Received</h2>");
        out.println("<p>First Name: " + fname + "</p>");
        out.println("<p>Last Name: " + lname + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Mobile: " + mobile + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
        
     // Forward the request to the studentInfo.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentInfo.jsp");
        dispatcher.forward(request, response);
    }
}

