package HomeWork1.src.Classes;

import Interfaces.Aquatic;

/*
*Класс кит расширяет класс млекопитающее так как их и является
* т.к. наследуется от млекопитающего и имеет позвоночник получает экземпляр класса Spine
* имплементирует интерфейс живущий в воде
*
* */


public class Whale extends Mammal implements Aquatic {

    Whale(int numberOfCerebra) {
        super(numberOfCerebra);
    }

    public void liveInWater() {
        System.out.println("Hello, I'm live in water");
    }

    public void helloWhile() {
        System.out.printf("Hello!I'm while, I have spine consisting of %d vertebrae \n",
                spine.getNumberOV());
    }

}
