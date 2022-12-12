package Practices.inheritanceVehicles;

public class Cars extends Vehicles {
    private int oneway_count =0;
    Cars(int oneway_count){
        this.oneway_count = oneway_count;
    }
    @Override
    public int speed(int kms, int hour){
        return divide(kms, hour)+oneway_count;
    }
}
