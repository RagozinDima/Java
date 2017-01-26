package oop.week1.studentData;

/**
 * Created by Joker on 22.01.2017.
 */
public class Group {
    private String name;
    private Student[] students;


    public Group (String name, Student [] students){
        this.name = name;
        this.students = students;
    }

    public void showStudents(){
        for (Student student : students) {
            System.out.println(student.asString());
        }
    }

    public String getName(){
        return name;
    }

    /*public void searchStudent (){
        String enterName;
        for (int i = 0; i <students.length; i++) {
            if(enterName == students[i])

        }


    }*/
}
