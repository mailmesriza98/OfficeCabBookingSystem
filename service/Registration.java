package service;

import database.RegisterCab;
import model.CabType;

public class Registration {

    RegisterCab registerCab = new RegisterCab();
    public void registercab(String cabId, String driver_name, CabType type, int capacity)
    {
        registerCab.register_new_cab(cabId, driver_name, type, capacity);
    }

    public void registerEmployee(String empId, String name){
        registerCab.register_employee(empId, name);
    }
}
