package garage.water;

import garage.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle{

    private int numberOfPaddles;
    private String hullType;

    public Kayak(float weight, int maxSpeed, String hullType){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
    }


    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }
}
