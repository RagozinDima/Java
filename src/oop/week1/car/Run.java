package oop.week1.car;

/**
 * Created by Joker on 25.01.2017.
 */
public class Run {
    public static void main(String[] args) {

        Wheel wheel = new Wheel(15,"bridgestoun");

        Wheel[] wheels = {wheel};

        Dvizhok dvizhok = new Dvizhok(1.6, "Ecoboost");

        Car car = new Car("Fiesta", wheels, dvizhok);
        car.setModel();
        car.showDvizhok();
        car.showWheels();

    }

}
