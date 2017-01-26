package oop.week1.person;

/**
 * Created by Joker on 22.01.2017.
 */
public class Maneger extends Person {

    private String sex;

    public Maneger(String name, String surname, int age, String sex) {
        super(name, surname, age);
        this.sex = sex;
    }
    public void asString(){
        System.out.printf("Person name - %s, surname - %s, age - %d, Sex - %s\n", name, surname, age, sex);
    }
}
