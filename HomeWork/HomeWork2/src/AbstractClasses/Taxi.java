package AbstractClasses;

/*
 * Наследуется от класса транспортные средства т.к. им и является is-a
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 *
 * */

import Classes.Rotor;
import Classes.Wheels;
import Classes.Wings;

import java.util.List;

public abstract class Taxi extends Vehicle {

    //колеса
    private int numberOfWheels;
    private double diameterOfWheels;
    private List<Wheels> wheels;

    public Taxi(int numberOfWheels, double diameterOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.diameterOfWheels = diameterOfWheels;
    }

    private void createWheels(int numberOfWheels) {
        for (int i = 0; i < numberOfWheels; i++) {
            wheels.add(new Wheels(diameterOfWheels));
        }

    }

}
