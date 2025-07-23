package Practice.pract;

public class Solution001 {
    public static void main(String[] args) {
        int x = 10;

        var c = new Cat();
        Cat.a();
        Cat.b();


        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Panda panda = new Panda();



       /* метод getClass является методом класса Object
        Он возвращает объект типа Class<?> (или Class<? extends T>
        в зависимости от контекста), который представляет класс
        или интерфейс объекта в рантайме.
        В данном случае cat — это экземпляр класса Cat, поэтому cat.getClass()
        возвращает Class<? extends Animal>, так как Cat
        является подклассом Animal.*/


        Class<? extends Animal> userClass = cat.getClass();

        /*Это статическая конструкция в Java, которая возвращает объект
        типа Class<T> для указанного класса T (в данном случае Dog)
        на этапе компиляции. Это поле .class доступно для любого
        класса или интерфейса.*/

        Class<Dog> userClass1 = Dog.class;


        System.out.println(userClass);
        System.out.println(userClass1);

        /*Что делает:
        Это статический метод класса Class, который динамически загружает
        класс по его полному имени (fully qualified name) и возвращает
        объект типа Class<?>.
        В данном случае Class.forName("pract.Panda") пытается загрузить
        класс Panda из пакета pract.
                Конкретное поведение:
        Метод выполняет поиск класса в classpath и инициализирует
        его (выполняет статические блоки, если они есть).
                Если класс не найден или имя указано неверно,
                выбрасывается ClassNotFoundException.
                Возвращает Class объект, представляющий класс Panda,
        если загрузка успешна.
                Требует точного полного имени класса, включая пакет.
                Используется для динамической загрузки классов, например,
        при разработке плагинов.*/

        try {
                Class<?> userClass2 = Class.forName("pract.Panda");
                System.out.println(userClass2);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }


non-sealed class Cat extends Animal{
    static void a() {
        int y = 20;
    }
    static void b() {
        int y = 30;
    }

}

//указываем sealed что класс имеет ограничение по расширению и permits
// печечисляем какие классы могут экстендится
//в расширяемых классамх надо указать их состояние
//non-sealed - класс дальше не имеет ограничений
//final - не может иметь наследников
//sealed -дальше ограничиваем extends
sealed class Animal permits Cat, Dog, Panda {

}

non-sealed class Dog extends Animal {

}

final class Panda extends Animal {

}

class Doberman extends Dog {

}
