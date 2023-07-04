package assignment;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletQ1 extends HttpServlet {

    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // Fetch data from ServletConfig
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String submittedUsername = request.getParameter("username");
        String submittedPassword = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Username: " + submittedUsername + "</h2>");
        out.println("<h2>Password: " + submittedPassword + "</h2>");
        out.println("<h2>Configured Username: " + username + "</h2>");
        out.println("<h2>Configured Password: " + password + "</h2>");
        out.println("</body></html>");
    }
}

