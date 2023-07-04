package assignment;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletContext1 extends HttpServlet {

    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // Fetch data from ServletContext
        ServletContext context = config.getServletContext();
        username = context.getInitParameter("username");
        password = context.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Username: " + username + "</h2>");
        out.println("<h2>Password: " + password + "</h2>");
        out.println("</body></html>");
    }
}

