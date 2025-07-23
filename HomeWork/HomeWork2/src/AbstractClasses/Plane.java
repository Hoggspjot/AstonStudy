package AbstractClasses;

import Classes.Rotor;
import Classes.Wheels;
import Classes.Wings;
import Interfaces.CarryLoads;

import java.util.List;

/*
 * Наследуется от класса транспортные средства
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 * имплементирует интерфейс перевозку грузов
 * получает экземпляры классов крылья , винт и колеса (требуется кличество колес и в цикле
 * создается указанное количество экземпляров колеса)
 *
 * */

public abstract class Plane extends Vehicle implements CarryLoads {
   //крылья
    private Wings wings;
    private double wingsLength;
    //винт
    private Rotor rotor;
    private double rotorDiameter;
    //колеса
    private int numberOfWheels;
    private double diameterOfWheels;
    private List<Wheels> wheels;

    public Plane(double wingsLength, double rotorDiameter, int numberOfWheels, double diameterOfWheels) {
        this.wings = new Wings(wingsLength);
        this.rotor = new Rotor(rotorDiameter);
        this.numberOfWheels = numberOfWheels;
        this.diameterOfWheels = diameterOfWheels;
    }

    private void createWheels(int numberOfWheels) {
        for (int i = 0; i < numberOfWheels; i++) {
            wheels.add(new Wheels(diameterOfWheels));
        }

    }

}
