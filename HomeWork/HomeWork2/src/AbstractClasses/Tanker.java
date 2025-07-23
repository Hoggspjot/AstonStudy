package AbstractClasses;

import Classes.Rotor;
import Interfaces.CarryLoads;

/*
 * Наследуется от класса транспортные средства
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 * имплементирует интерфейс перевозка грузов
 *получает экземпляр класса винт
 * */

public abstract class Tanker extends Vehicle implements CarryLoads {
    //винт
    private Rotor rotor;
    private double rotorDiameter;

    public Tanker(double rotorDiameter) {
        this.rotor = new Rotor(rotorDiameter);
    }
}
