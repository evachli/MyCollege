package gr.codehub.NewCollege.demo.service;

import gr.codehub.NewCollege.demo.model.College;
import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.model.Student;
import gr.codehub.NewCollege.demo.repository.RepositoryReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
