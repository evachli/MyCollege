package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.util.Util;

import java.util.ArrayList;
import java.util.List;

public class StudentReader {

    public List<Student> readAllStudentsData() {
        List<Student> students = new ArrayList<>();
        for (int i=1; i<=10; i++){
            Student s = readStudentData();
            students.add(s);
        }
        return students;
    }

    public Student readStudentData() {
        Student student = new Student();
        String name = Util.randomName("Student");
        student.setName(name);
        return student;
    }
}
