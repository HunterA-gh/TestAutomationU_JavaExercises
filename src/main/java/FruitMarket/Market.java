package FruitMarket;

public class Market {

    public static void main(String[] args) {
        Fruit banana1 = new Banana(90);
        banana1.makeJuice();
        juiced(banana1);

        ((Banana) banana1).peel();

        banana1 = new Apple(110);
        banana1.makeJuice();
        juiced(banana1);

        Fruit someFruit = new Fruit();
        juiced(someFruit);


    }

    public static void juiced(Fruit fruit){
        fruit.makeJuice();
    }
}
