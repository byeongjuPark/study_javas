package Practices.inheritanceVehicles;


public class Vehicles extends Calculations{
    Vehicles(){}
    public int speed(int km, int hour){
        return divide(km, hour);
    }

    public int weight(int height, int width, int depth){
        return multiply(multiply(height, width),depth);
    }
}
