package week1.flowers;

import java.util.Arrays;

/**
 * Created by User2 on 27.01.2017.
 */
public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public void priceBouquet(){
        double price = 0;
        for (int i = 0; i < flowers.length; i++) {
            price = price + flowers[i].getFlowerPrice();
        }
        System.out.println("Bouquet price is - " + price + " dollars");
    }
    
    public void showBouquet (){
        for (int i = 0; i < flowers.length; i++) {
            flowers[i].showFlowerInfo();
        }
    }

    public void sortFresh() {
        for (int i = 0; i < flowers.length-1; i++) {
            for (int j = i + 1; j < flowers.length ; j++) {
                if (flowers[i].fresh > flowers[j].fresh){
                    int tmp = flowers[i].fresh;
                    flowers[i].fresh = flowers[j].fresh;
                    flowers[j].fresh = tmp;
                }
            }
        }
    }

    public void findTheFlower (double sizeFlower){
        int matches = 0;
        for (int i = 0; i < flowers.length; i++) {
            if(flowers[i].getFlowerSize() == sizeFlower ){
                matches++;
                if(matches == 1) {
                    System.out.println("Search flower size: " + sizeFlower + " found flowers: " + flowers[i].getFlowerName());
                }
            }matches = 0;
        }if(matches == 0 | matches > 1){
            System.out.println("There is no flowers size - " +sizeFlower);
        }
    }

}
