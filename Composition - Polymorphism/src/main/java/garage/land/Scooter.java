package garage.land;

import garage.Vehicle;

public class Scooter extends Vehicle {

    public Scooter(float weight, int maxSpeed, boolean hasBreaks){
        super(weight, maxSpeed);
    }

    public void doTailWhip(){
        System.out.println("Doing some rad moves");
    }


}
