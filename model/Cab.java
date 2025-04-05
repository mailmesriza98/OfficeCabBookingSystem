package model;

public class Cab {
    //cab ID, Driver Name, Vehicle Type [SUV, SEDAN], capacity
    String cabId;
    String driver_name;
    CabType type;
    int capacity;

    public Cab(String cabId, String driver_name, CabType type, int capacity) {
        this.cabId = cabId;
        this.driver_name = driver_name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getCabId() {
        return cabId;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public CabType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
