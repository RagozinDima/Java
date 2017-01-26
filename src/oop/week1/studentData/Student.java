package oop.week1.studentData;

/**
 * Created by Joker on 04.01.2017.
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageMark;


    public Student(String name, String surname, int age, double averageMark){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String asString(){
        return String.format("Student name - %s, surname - %s, age - %d, marks - %.1f\n", name, surname, age, averageMark);
    }
}
