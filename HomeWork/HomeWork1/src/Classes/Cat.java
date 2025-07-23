package HomeWork1.src.Classes;
/*
* Класс кот который уже может не являться абстрактным и иметь конкретную реализацию
* наследуется от класса млекопитающее т.т. им и является
* в параметры передается имя, экземпляры класса позвоночник и шерсть
*
*
* */
public class Cat extends Mammal {
    private String name;
    private Wool wool;

    public Cat(String name, String colorOfWool, int numberOfVertebra) {
        super(numberOfVertebra);
        this.name = name;
        this.wool = new Wool(colorOfWool);
    }

    public void helloCat() {
        System.out.printf("Hello!I'm %s I have a %s color of wool and spine consisting of %d vertebrae \n",
                name, wool.getColor(), spine.getNumberOV());
    }

}
