package oop.week1.car;

/**
 * Created by Joker on 25.01.2017.
 */
public class Wheel {

    private int wheelR;
    private String wheelMark;


    public Wheel(int wheelR, String wheelMark){
        this.wheelR = wheelR;
        this.wheelMark = wheelMark;
    }

    public String chengeWheel(){
        return String.format("Wheels mark is '%s' and wheel radius is '%d'", wheelMark, wheelR);
    }
}
