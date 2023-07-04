package assignment;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class StudentServlet2 extends HttpServlet {
    private StudentDAO studentDao;

    public void init() {
        studentDao = new StudentDAO(); // Initialize the data access object (DAO)
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "view":
                    viewStudent(request, response);
                    break;
                case "edit":
                    editStudentForm(request, response);
                    break;
                case "update":
                    updateStudent(request, response);
                    break;
                case "delete":
                    deleteStudent(request, response);
                    break;
                default:
                    response.sendRedirect("index.jsp");
                    break;
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "add":
                    addStudent(request, response);
                    break;
                default:
                    response.sendRedirect("index.jsp");
                    break;
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");

        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zipCode);

        Student2 student = new Student2();
        Student2.setStudentName(studentName);
        Student2.setAddress(address);

        StudentDao2.addStudent(student);

        response.sendRedirect("index.jsp");
    }

    private void viewStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        Student student = studentDao.getStudent(studentId);

        request.setAttribute("student", student);
        request.getRequestDispatcher("view.jsp").forward(request, response);
    }

    private void editStudentForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        Student student = studentDao.getStudent(studentId);

        request.setAttribute("student", student);
        request.getRequestDispatcher("edit.jsp").forward(request, response);
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        String studentName = request.getParameter("studentName");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");

        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zipCode);

        Student student = StudentDAO.getStudent(studentId);
        student.setStudentName(studentName);
        student.setAddress(address);

        studentDao.updateStudent(student);

        response.sendRedirect("index.jsp");
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        studentDao.deleteStudent(studentId);

        response.sendRedirect("index.jsp");
    }
}

