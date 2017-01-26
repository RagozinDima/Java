package oop.week1.dog;

/**
 * Created by Joker on 25.01.2017.
 */
public class Animals {
    protected String name;

    public Animals(String name){
        this.name = name;
    }
    public void getJump (){
        System.out.println("Animal is Jumping!");
    }

    public void getRun (){
        System.out.println("Animal is runing!");
    }

}
