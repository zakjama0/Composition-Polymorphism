import garage.air.helicopter;
import garage.engine.ElectricalEngine;
import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.IEngine;
import garage.water.Pedalboat;

public class Runner {

    public static void main(String[] args) {


        IEngine combustionEngine = new CombustionEngine(99, "07.08.2023");
        Car hondaJazz = new Car(1300, 150, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());


        IEngine electicalEngine = new ElectricalEngine(350,45);
        hondaJazz.setEngine(electicalEngine);
        System.out.println(hondaJazz.getHorsePower());

        Pedalboat pedalboat = new Pedalboat(78, 240, 50, electicalEngine);
        System.out.println(pedalboat.getHorsePower());

        helicopter helicopter = new helicopter(56, 990, 5, combustionEngine, 500);
        helicopter.setEngine(electicalEngine);
        System.out.println(helicopter.getHorsePower());
        System.out.println(helicopter.getAltitude());

    }

}
