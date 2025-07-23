package HomeWork2.src.AbstractClasses;


/*
 * Наследуется от класса транспортные средства
 * является абстрактным т.к. это широкое некокретизированное понятие
 *
 * имплементирует интерфейс перевозка грузов
 *получает экземпляр класса винт
 * */

import HomeWork2.src.Classes.Rotor;
import HomeWork2.src.Interfaces.CarryLoads;

public abstract class Tanker extends Vehicle implements CarryLoads {
    //винт
    private Rotor rotor;
    private double rotorDiameter;

    public Tanker(double rotorDiameter) {
        this.rotor = new Rotor(rotorDiameter);
    }
}
