package oop.week1.book;

/**
 * Created by Joker on 25.01.2017.
 */
public class Run {
    public static void main(String[] args) {

        Spravochnik spravochnik = new Spravochnik();
        Encyclopedia encyclopedia = new Encyclopedia();

        Izdanie[] izdanies = {spravochnik,encyclopedia};

        for (int i = 0; i < izdanies.length; i++) {
            izdanies[i].asString();
            System.out.println();
        }
    }

}
