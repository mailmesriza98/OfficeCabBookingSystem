package service;

import database.RegisterCab;
import model.CabType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CabScheduler {
    private HashMap<String, List<String>> timeToEmployeeMapping;
    RegisterCab registerCab;

    public CabScheduler(){
        timeToEmployeeMapping = new HashMap<>();
        registerCab = new RegisterCab();
    }
    public String schedule_cab(String empId, String pickupTime){
        if(!timeToEmployeeMapping.containsKey((pickupTime))){
            List<String> employees = new ArrayList<>();
            employees.add(empId);
            timeToEmployeeMapping.put(pickupTime, employees);
        }else{
            List<String> employees = timeToEmployeeMapping.get(pickupTime);
            employees.add(empId);
            timeToEmployeeMapping.put(pickupTime, employees);
        }
        System.out.println(timeToEmployeeMapping);
        return schedule(empId);
    }

    private String schedule(String empId) {
        for(String time: timeToEmployeeMapping.keySet()){
            if(timeToEmployeeMapping.get(time).size() <= 4){
                return registerCab.book(CabType.SEDAN, empId);
            } else{
                return registerCab.book(CabType.SUV, empId);
            }
        }
        return "Booking cant be made";
    }

    public void registercab(String cabId, String driver_name, CabType type, int capacity)
    {
        registerCab.register_new_cab(cabId, driver_name, type, capacity);
    }

    public void registerEmployee(String empId, String name){
        registerCab.register_employee(empId, name);
    }
}
