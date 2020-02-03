package gr.codehub.NewCollege.demo.controller;

import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.service.CollegeServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {

    @GetMapping("courses")
    public List<Course> getCourses() {
        List<Course> courses = new CollegeServices().getCourses();
        return courses;
    }

    @GetMapping("students")
    public List<Student> getCStudents() {
        List<Student> students = new CollegeServices().getStudents();
        return students;
    }
}
