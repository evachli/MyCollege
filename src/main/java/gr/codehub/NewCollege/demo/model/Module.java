package gr.codehub.NewCollege.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Module {
    private String name;
    private List<Attendance> attendances;

    public Module() {
        attendances = new ArrayList<>();
    }
}
