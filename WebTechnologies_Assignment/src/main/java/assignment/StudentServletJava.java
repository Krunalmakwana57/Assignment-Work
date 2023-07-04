package assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServletJava")
public class StudentServletJava extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static List<Student> students = new ArrayList<>();
    private static int nextId = 1;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            deleteStudent(id);
            response.sendRedirect("index.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action.equals("add")) {
            Student student = new Student();
            student.setId(nextId++);
            student.setFirstName(request.getParameter("firstName"));
            student.setLastName(request.getParameter("lastName"));
            student.setEmail(request.getParameter("email"));
            student.setMobile(request.getParameter("mobile"));
            student.setGender(request.getParameter("gender"));
            
            students.add(student);
            
            response.sendRedirect("index.jsp");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Student student = getStudentById(id);
            
            if (student != null) {
                student.setFirstName(request.getParameter("firstName"));
                student.setLastName(request.getParameter("lastName"));
                student.setEmail(request.getParameter("email"));
                student.setMobile(request.getParameter("mobile"));
                student.setGender(request.getParameter("gender"));
            }
            
            response.sendRedirect("index.jsp");
        }
    }
    
    private void deleteStudent(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
        }
    }
    
    private Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    
    public static List<Student> getStudents() {
        return students;
    }
}

