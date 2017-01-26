package oop.week1.book;

/**
 * Created by Joker on 25.01.2017.
 */
public class Run {
    public static void main(String[] args) {

        Izdanie[] izdanies = {new Spravochnik(), new Encyclopedia()};

        for (int i = 0; i < izdanies.length; i++) {
            izdanies[i].asString();
            System.out.println();
        }
    }

}
