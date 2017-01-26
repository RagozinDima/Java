package oop.week1.person;

/**
 * Created by Joker on 22.01.2017.
 */
public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void asString(){
        System.out.printf("Person name - %s, %s, age - %d, \n", name, surname, age);
    }

}
