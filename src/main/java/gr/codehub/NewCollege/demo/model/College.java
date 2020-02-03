package gr.codehub.NewCollege.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class College {
    private List<Student> students;
    private List<Course> courses;

    public College(){
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
}
