package gr.codehub.NewCollege.demo.service;

import gr.codehub.NewCollege.demo.model.*;
import gr.codehub.NewCollege.demo.model.Module;
import gr.codehub.NewCollege.demo.repository.AttendanceReader;
import gr.codehub.NewCollege.demo.repository.RepositoryReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
public class CollegeServices {

    public List<Course> getCourses(){
        RepositoryReader rr = new RepositoryReader();
        College college = rr.readRepository();
        return college.getCourses();
    }

    public List<Student> getStudents(){
        RepositoryReader rr = new RepositoryReader();
        College college = rr.readRepository();
        return college.getStudents();
    }

    public Student getStudent(int id) throws IOException {
        RepositoryReader rr = new RepositoryReader();
        College college = rr.readRepository();

        List<Student> students;
        students = college.getStudents();

        return students
                .stream()
                .filter(student -> student.getId()==id)
                .findFirst()
                .get();

    }

    public List<Module> getStudentModules(int id) throws IOException {
        RepositoryReader rr = new RepositoryReader();
        College college = rr.readRepository();

        List<Student> students = new ArrayList<>();
        students = college.getStudents();

        Student s ;
        s = students
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .get();

        Attendance attendance = new Attendance();
        attendance.setStudent(s);
        Module m = new Module();
        List<Module> modules = new ArrayList<>();
        if (m.getAttendances().equals(attendance)) {
            modules.add(m);
        }
        return modules;
    }

}
