package gr.codehub.NewCollege.demo.repository;

import gr.codehub.NewCollege.demo.controller.Registry;
import gr.codehub.NewCollege.demo.model.College;

public class CollegeReader {

    public College readCollegeData(){
        College c = Registry.getCollege();
        return c;
    }
}
