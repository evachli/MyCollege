package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.model.Attendance;
import gr.codehub.NewCollege.demo.model.Course;
import gr.codehub.NewCollege.demo.util.Util;
import gr.codehub.NewCollege.demo.model.Module;

import java.util.ArrayList;
import java.util.List;

public class ModuleReader {
    public List<Module> readAllmodulesData() {
        List<Module> modules = new ArrayList<>();
        for (int i=1; i<=10; i++){
            Module m = readmoduleData();
            modules.add(m);
        }
        return modules;
    }

    public Module readmoduleData() {
        Module module = new Module();
        String name = Util.randomName("Module");
        module.setName(name);
        AttendanceReader attendanceReader = new AttendanceReader(module);
        module.setAttendances(attendanceReader.readAllAttendancesData());

        return module;
    }
}
