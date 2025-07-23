package HomeWork2.src.AbstractClasses;



import HomeWork2.src.Classes.Rotor;
import HomeWork2.src.Classes.Wheels;
import HomeWork2.src.Interfaces.CarryLoads;

import java.util.List;
/*
 * Наследуется от класса транспортные средства
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 * имплементирует интерфейс перевозку грузов
 * Получает экземпляры классов винт и колеса колеса (требуется кличество колес и в цикле
 * создается указанное количество экземпляров колеса)
 *
 *
 * */

public abstract class Helicopter extends Vehicle implements CarryLoads {
    //винт
    private Rotor rotor;
    private double rotorDiameter;
    //колеса
    private int numberOfWheels;
    private double diameterOfWheels;
    private List<Wheels> wheels;

    public Helicopter(double rotorDiameter,int numberOfWheels, double diameterOfWheels) {
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
