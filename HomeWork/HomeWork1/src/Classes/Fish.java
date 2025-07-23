package HomeWork1.src.Classes;

import Interfaces.Aquatic;

/*
* На мой взгляд класс рыба остается абстрактным т.к. это очень широкое понятие
* расширяет класст животное т.к. им является
* имплементирует интерфейс живущий в воде
*
* */

public abstract class Fish extends Animal implements Aquatic {

    public void liveInWater() {
        System.out.println("Hello, I'm live in water");
    }

}
