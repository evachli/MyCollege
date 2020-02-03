package gr.codehub.NewCollege.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    private Student student;
    private Mark mark;
    private int year;
}
