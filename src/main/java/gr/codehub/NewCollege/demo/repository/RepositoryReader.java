package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.model.College;
import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.model.Module;
import gr.codehub.NewCollege.demo.repository.ModuleReader;

import java.util.List;

public class RepositoryReader {
    public College readRepository() {
        CollegeReader collegeReader = new CollegeReader();
        College college = collegeReader.readCollegeData();

        StudentReader studentReader = new StudentReader();
        List<Student> students = studentReader.readAllStudentsData();
        college.setStudents(students);

        CourseReader courseReader = new CourseReader();
        List<Course> courses = courseReader.readAllCoursesData();

        college.setCourses(courses);

        //college.getCourses().addAll(courses);
        return college;
    }
}
