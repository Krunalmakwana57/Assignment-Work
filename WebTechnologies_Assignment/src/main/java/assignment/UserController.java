package assignment;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {
    private UserDao userDAO;

    public void init() {
        userDAO = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("addUser")) {
            addUser(request, response);
        } else {
            // Handle other actions
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        UserModel user = new UserModel();
        user.setFname(fname);
        user.setLname(lname);
        user.setEmail(email);
        user.setMobile(mobile);

        userDAO.addUser(user);

        response.sendRedirect("success.jsp");
    }
}
