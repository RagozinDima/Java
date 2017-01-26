package oop.week1.car;

/**
 * Created by Joker on 25.01.2017.
 */
public class Dvizhok {
    private double litrazh;
    private String type;

    public Dvizhok(double litrazh, String type){
        this.litrazh = litrazh;
        this.type = type;
    }

    public String Go(){
        return String.format("Dvizhok v poryadke! Ob'em dvizhka - (%.1f), type - %s. You can go!", litrazh, type);
    }
}
