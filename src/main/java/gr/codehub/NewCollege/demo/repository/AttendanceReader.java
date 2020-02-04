package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.controller.Registry;
import gr.codehub.NewCollege.demo.model.*;
import gr.codehub.NewCollege.demo.model.Module;
import gr.codehub.NewCollege.demo.util.Util;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AttendanceReader {
    private Module module;

    public AttendanceReader(Module module) {
        this.module = module;
    }

    public List<Attendance> readAllAttendancesData() {
        List<Attendance> attendances = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Student student = Registry.chooseRandomCollegeStudent();
            Attendance a = readAttendanceData(student);
            attendances.add(a);
        }
        return attendances;
    }

    public Attendance readAttendanceData(Student student) {
        Attendance attendance = new Attendance();
        Mark mark = new Mark();
        mark.setResult(Util.randomInt(10, 20));
        mark.setMarkerName("Stella");
        attendance.setYear(Util.randomInt(2010, 2020));
        attendance.setMark(mark);

        attendance.setStudent(student);
        return attendance;
    }
}
