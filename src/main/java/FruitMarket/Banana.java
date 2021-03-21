package FruitMarket;

public class Banana extends Fruit{

    public Banana(int calories){
        this.setCalories(calories);
    }

    public void makeJuice(){
        System.out.println("Banana juice is made");
    }

    public void peel(){
        System.out.println("Banana peeled");
    }

}
