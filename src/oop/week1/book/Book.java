package oop.week1.book;

/**
 * Created by Joker on 25.01.2017.
 */
public abstract class Book implements Izdanie {
    private String bookName;
    private int year;

    public Book(String bookName, int year) {
        this.bookName = bookName;
        this.year = year;
    }

    public void asString(){
        System.out.printf("The book name - '%s', year - %d", bookName, year);
    }
}
