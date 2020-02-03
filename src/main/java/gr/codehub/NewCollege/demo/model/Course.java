package gr.codehub.NewCollege.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private String courseName;
    private List<Module> modules;

    public Course(){
        modules = new ArrayList<>();
    }

}
