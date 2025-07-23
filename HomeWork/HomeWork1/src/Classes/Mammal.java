package HomeWork1.src.Classes;

/*
* Абстрактный класс млекопитающее
* наследуется от класса животное т.к. все млекопитающие являются животными - is-a
*
* в конструкторе создается экземпляр класса позвоночник
* т.к. млекопитающие имеют позвоночник
* в параметры передается количество позвонков как индивидуальная характеристика
* для примера
*
* */


public abstract class Mammal extends Animal {
    Spine spine;

    Mammal(int numberOfVertebra) {
        this.spine = new Spine(numberOfVertebra);
    }


}
