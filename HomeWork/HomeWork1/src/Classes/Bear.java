package HomeWork1.src.Classes;

/*
* Класс медведь, который уже может не являться абстрактным
* наследуется от класса млекопитающее т.к. является им по сути
* имеет экземпляр класса шерсть и позвоночник
*
* */


public class Bear extends Mammal {
    private Wool wool;

    public Bear(String colorOfWool, int numberOfCerebra) {
        super(numberOfCerebra);
        this.wool = new Wool(colorOfWool);
    }

    public void helloBear() {
        System.out.printf("Hello! =) I'm Bear I have %s wool color and spine consisting of %d vertebrae \n",
                wool.getColor(), spine.getNumberOV());
    }
}
