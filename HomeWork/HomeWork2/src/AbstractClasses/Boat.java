package AbstractClasses;

import Classes.Rotor;
import Interfaces.CarryLoads;

/*
* Наследуется от класса транспортные средства
* является абстрактным т.к. это широкое некокретизированное понятие
*
* имплементирует интерфейс перевозку грузов
* и получает экземпляр класса винт
*
* */

public abstract class Boat extends Vehicle implements CarryLoads {
    private Rotor rotor;
    private double rotorDiameter;

    public Boat(double rotorDiameter) {
        this.rotor = new Rotor(rotorDiameter);
    }



}
