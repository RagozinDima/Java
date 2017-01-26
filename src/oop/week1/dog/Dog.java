package oop.week1.dog;

/**
 * Created by Joker on 25.01.2017.
 */
public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }
    public void getTheVoice (){
        System.out.println("Rrrrr...!");
    }

    public void getBite (){
        System.out.println("Biting!");
    }
}
