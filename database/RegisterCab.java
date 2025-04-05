package database;

import model.Cab;
import model.CabType;
import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegisterCab {
    private static HashMap<CabType, List<Cab>> cabcounts;
    private static List<Employee> employees;
    private HashMap<Cab, Employee> cabToEmployee;

    public RegisterCab(){
        cabcounts = new HashMap<>();
        employees = new ArrayList<>();
        cabToEmployee = new HashMap<>();
    }
    public static void register_new_cab(String cabId, String driver_name, CabType type, int capacity){
        Cab cab = new Cab(cabId, driver_name, type, capacity);
        //cabs.add(cab);
        List<Cab> cabs;
        if(cabcounts.containsKey(type)){
            cabs = cabcounts.get(type);
            cabs.add(cab);
            cabcounts.put(type, cabs);
        } else{
            cabs = new ArrayList<>();
            cabs.add(cab);
            cabcounts.put(type, cabs);
        }
        System.out.println(cabcounts);
    }

    public static void register_employee(String empId, String name){
        Employee employee = new Employee(empId, name);
        employees.add(employee);
    }
    public static String book(CabType cabType, String empId) {
        String cabId = "";
        if(cabcounts.containsKey((cabType)) && !cabcounts.get(cabType).isEmpty()){
            cabId = cabcounts.get(cabType).get(0).getCabId();
            cabcounts.get(cabType).remove(0);
            cabcounts.put(cabType, cabcounts.get(cabType));
        } else{
            cabId = "Cant assign as no available cabs of type " + cabType;
        }
        System.out.println(cabId);
        return cabId;
    }
}
