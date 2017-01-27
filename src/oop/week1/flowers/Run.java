package week1.flowers;

/**
 * Created by User2 on 27.01.2017.
 */
public class Run {
    public static void main(String[] args) {
        Flower tulip = new Flower("Tulip", 8,10,2);
        Gerbera gerbera = new Gerbera("Gerber", 12,13,5);
        Rose rose = new Rose("Rose", 10,15,3);
        Daisy daisy = new Daisy("Daisy",7.5,10,4);

        Flower[] flowers = {tulip, gerbera, rose, daisy};

        Bouquet bouquet = new Bouquet(flowers);
        bouquet.showBouquet();
        bouquet.priceBouquet();

        System.out.println();
        bouquet.sortFresh();
        bouquet.showBouquet();

        System.out.println();
        bouquet.findTheFlower(10);

    }
}
