package garage.land;

import garage.Vehicle;
import garage.engine.IEngine;
public class Car extends Vehicle implements ILandVehicle, IEngine {

    private String type;
    private int numberOfWheels;
    private IEngine engine;

    public Car(float weight, int maxSpeed, String type, IEngine engine){
        super(weight, maxSpeed);
        this.type = type;
        this.numberOfWheels = 4;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}