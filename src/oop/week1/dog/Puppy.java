package oop.week1.dog;

/**
 * Created by Joker on 25.01.2017.
 Создать объект класса Щенок, используя классы Животное, Собака.
 Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.*/
public class Puppy extends Dog {
    private int age;

    public Puppy(String name, int age) {
        super(name);
        this.age = age;
    }


    public void showPuppyInfo (){
        System.out.printf("Puppy name is '%s', he is %d years old", name, age);
    }

}
