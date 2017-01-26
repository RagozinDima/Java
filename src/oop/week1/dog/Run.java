package oop.week1.dog;

/**
 * Created by Joker on 25.01.2017.
 */
public class Run {
    public static void main(String[] args) {

        Puppy puppy = new Puppy("Jack", 1);

        puppy.showPuppyInfo();
        System.out.println();
        puppy.getTheVoice();
        puppy.getBite();
        puppy.getJump();
        puppy.getRun();
    }
}
