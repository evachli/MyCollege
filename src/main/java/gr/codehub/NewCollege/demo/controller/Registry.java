package gr.codehub.NewCollege.demo.controller;

import gr.codehub.NewCollege.demo.model.College;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.util.Util;

import java.util.List;

public class Registry {
    private static College college;

    //SINGLETON like Gregorian calendar
    //NEVER CALL A COLLEGE CLASS YOU ONLY CALL THIS cause you only have one college
    //If I need a college I call College college = new Registry.getCollage();
    //at spring we dont use static variables or methods but this registry is not for the web its only for practical reasons
    //STATIC CONSTRUCTOR
    static {
        college = new College();
    }

    public static College getCollege() {
        return college;
    }

    public static Student chooseRandomCollegeStudent() {
        List<Student> students = college.getStudents();
        return students.get(Util.randomInt(0, students.size()-1));
    }
}
