package HomeWork2.src.AbstractClasses;



import HomeWork2.src.Classes.Wheels;
import HomeWork2.src.Interfaces.CarryLoads;

import java.util.List;

/*
 * Наследуется от класса транспортные средства т.к. им и является
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 * имплементирует интерфейс перевозку грузов
 * и получает экземпляры класса колеса
 * */

public abstract class Truck extends Vehicle implements CarryLoads {
    //колеса
    private int numberOfWheels;
    private double diameterOfWheels;
    private List<Wheels> wheels;

    public Truck(int numberOfWheels, double diameterOfWheels) {
        this.numberOfWheels = numberOfWheels;
        this.diameterOfWheels = diameterOfWheels;
    }


    private void createWheels(int numberOfWheels) {
        for (int i = 0; i < numberOfWheels; i++) {
            wheels.add(new Wheels(diameterOfWheels));
        }

    }

}
