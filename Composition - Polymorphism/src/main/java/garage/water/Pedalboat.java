package garage.water;

import garage.Vehicle;
import garage.engine.IEngine;

public class Pedalboat extends Vehicle implements IWaterVehicle, IEngine {
    private int numberOfSeats;
    private String hullType;

    IEngine engine;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public int getHorsePower(){
        return engine.getHorsePower();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
