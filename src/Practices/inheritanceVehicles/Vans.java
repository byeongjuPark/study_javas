package Practices.inheritanceVehicles;

public class Vans extends Vehicles{

    public Vans() {
    }

    public int windows_count(int oneway_count){
        return multiply(oneway_count, 3);
    }
}
