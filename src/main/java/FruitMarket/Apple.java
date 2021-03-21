package FruitMarket;

public class Apple extends Fruit{

    public Apple(int calories){
        this.setCalories(calories);
    }

    public void makeJuice(){
        System.out.println("Apple juice is made");
    }

    public void removeSeeds(){
        System.out.println("Seeds removed");
    }
}
