package garage.land;

import garage.Vehicle;
import garage.engine.IEngine;

public class Bus extends Vehicle implements ILandVehicle {

    private boolean isDoubleDecker;
    private int numberOfWheels;

    private IEngine engine; // dependency, relying on an interface, you cant instantiate it however

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 4;
        this.engine = engine;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }
}
