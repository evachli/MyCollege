package gr.codehub.NewCollege.demo.controller;

import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.model.Module;
import gr.codehub.NewCollege.demo.service.CollegeServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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

    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable int id) throws IOException {
        Student student = new CollegeServices().getStudent(id);
        return student;
    }

    @GetMapping("student/{id}/modules")
    public List<Module> getStudentModulesById(@PathVariable int id) throws IOException {
        List<Module> modules = new CollegeServices().getStudentModules(id);
        return modules;
    }



}
