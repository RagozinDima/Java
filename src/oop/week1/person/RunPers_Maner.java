package oop.week1.person;

/**
 * Created by Joker on 22.01.2017.
 */
public class RunPers_Maner {
    public static void main(String[] args) {

        Person person = new Person("dima", "rahozin", 20);
        Maneger maneger = new Maneger("vasya", "pupkin", 19, "Man");

        person.asString();
        maneger.asString();



    }


}