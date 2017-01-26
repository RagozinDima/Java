package oop.week1.studentData;

/**
 * Created by Joker on 22.01.2017.
 */
public class Run {
    public static void main(String[] args) {
        Student std1 = new Student ("Dima", "Rahozin", 19, 4);
        Student std2 = new Student ("Denis", "Patapenko", 20, 4.5);
        Student std3 = new Student ("Artur", "Noskov", 18, 3);
        Student std4 = new Student ("Kolya", "Barvinskiy", 23, 5);
        Student std5 = new Student ("Petr", "Zhek", 22, 3.5);
        Student std6 = new Student ("Anton", "Rudenko", 20, 4);
        Student std7 = new Student ("Zhenya", "Chernov", 19, 3);
        Student std8 = new Student ("Kiril", "Gaidai", 24, 5);

        Student[] students = {std1, std2, std3, std4};
        Student[] students2 = {std5, std6, std7, std8};

        Group group1 = new Group("First_Group", students);
        Group group2 = new Group("Second_Group", students2);

        Group[] groups = {group1, group2};

        University university = new University("KPI", groups);
        System.out.println("Groups:");
        university.showGroups();

        System.out.println("Students:");
        university.showStudents();
    }
}
