package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Module;
import gr.codehub.NewCollege.demo.util.Util;

import java.util.ArrayList;
import java.util.List;

public class CourseReader {

    public List<Course> readAllCoursesData() {
        List<Course> courses = new ArrayList<>();
        for (int i=1; i<=10; i++){
            Course c = readCourseData();
            courses.add(c);
        }
        return courses;
    }

    public Course readCourseData() {
        Course course = new Course();
        String name = Util.randomName("Course");
        course.setCourseName(name);

        ModuleReader moduleReader = new ModuleReader();
        course.setModules(moduleReader.readAllmodulesData());
        return course;
    }
}
