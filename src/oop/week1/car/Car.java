package oop.week1.car;

/**
 * Created by Joker on 25.01.2017.
 */
public class Car {
    private String model;
    private Dvizhok dvizhok;
    private Wheel[] wheels;

    public Car(String model, Wheel[] wheels, Dvizhok dvizhok ){
        this.model = model;
        this.wheels = wheels;
        this.dvizhok = dvizhok;
    }

    public void setModel(){
        System.out.println("The car model is - " + model);
    }

    public void showWheels() {
        for (Wheel Wheel : wheels) {
            System.out.println(Wheel.chengeWheel());
        }
    }

    public void showDvizhok(){
        System.out.println(dvizhok.Go());
    }


}
