package pract;

import java.lang.reflect.Field;

public class less {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Human human = new Human();

        System.out.println(human.getName());

        Class<? extends Human> aClass = human.getClass();
        System.out.println(aClass.getClassLoader());

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(human, "Alice");

        System.out.println(human.getName());
    }
}


class Human {
    private String name;
    private int age;

    public Human() {

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}