package assignment;

import java.util.*;

public class StudentDao2 {
    private static List<Student2> students = new ArrayList<>();
    private int nextStudentId = 1;

    public void addStudent(Student2 student) {
        student.setStudentId(nextStudentId++);
        students.add(student);
    }

    public Student2 getStudent(int studentId) {
        for (Student2 student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Student2 updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student2 student = students.get(i);
            if (student.getStudentId() == updatedStudent.getStudentId()) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    public void deleteStudent(int studentId) {
        Iterator<Student2> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student2 student = iterator.next();
            if (student.getStudentId() == studentId) {
                iterator.remove();
                break;
            }
        }
    }

    public List<Student2> getAllStudents() {
        return students;
    }
}

