package week1.flowers;

/**
 * Created by User2 on 27.01.2017.
 */
public class Flower {
    private String flowerName;
    private double flowerPrice;
    private int flowerSize;
    protected int fresh;

    public Flower(String flowerName, double flowerPrice, int flowerSize, int fresh) {
        this.flowerName = flowerName;
        this.flowerPrice = flowerPrice;
        this.flowerSize = flowerSize;
        this.fresh = fresh;
    }

    public void showFlowerInfo() {
        System.out.printf("Flower - (%s), size - (%dcm), price - (%.1f), freshness from 1 to 5 - (%d)\n",
                flowerName, flowerSize, flowerPrice, fresh);
    }

    public double getFlowerPrice(){
        return flowerPrice;
    }

    public int getFresh(){
        return fresh;
    }

    public int getFlowerFresh(){
        return fresh;
    }

    public int getFlowerSize(){
        return flowerSize;
    }

    public String getFlowerName(){
        return flowerName;
    }




}
