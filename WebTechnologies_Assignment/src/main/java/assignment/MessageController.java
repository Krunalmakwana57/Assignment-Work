package assignment;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageController extends HttpServlet {
    private MessageDAO messageDAO;

    public void init() {
        messageDAO = new MessageDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("addMessage")) {
            addMessage(request, response);
        } else {
            // Handle other actions
        }
    }

    private void addMessage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int uid = Integer.parseInt(request.getParameter("uid"));
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String msg = request.getParameter("msg");

        MessegeModel message = new MessegeModel();
        message.setUid(uid);
        message.setFrom(from);
        message.setTo(to);
        message.setMsg(msg);

        messageDAO.addMessage(message);

        response.sendRedirect("success.jsp");
    }
}

