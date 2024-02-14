package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;

public class helicopter extends Vehicle implements IEngine, IAirVehicle {

    private int numberOfBlades;
    private IEngine engine; // composition
    private int altitude;

    public helicopter(float weight, int maxSpeed, int numberOfBlades, IEngine engine, int altitude){
        super(weight,maxSpeed); // inherits from vehicle
        this.numberOfBlades = numberOfBlades;
        this.altitude = altitude;
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    @Override
    public int getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setEngine(IEngine engine){
        this.engine = engine;
    }
}
