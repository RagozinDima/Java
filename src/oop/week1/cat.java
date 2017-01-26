package oop.week1;

/**
 * Created by Joker on 22.01.2017.
 */
public class cat {
    String name;
    int age;

    public cat(String name, int age){
        this.name =  name;
        this.age = age;
    }

    public void setName (String name){
         if (name == null || name.isEmpty()) return;
         this.name = name;
    }

    public void asString(){
        System.out.printf("cat name - %s, age - %d,\n", name, age);
    }



}
