package Cakes;

public class TasteTester {

    public static void main(String[] args) {
        BirthdayCake bDayCake = new BirthdayCake("chocolate");
        bDayCake.setPrice(30);
        bDayCake.setCandles(10);

        System.out.println("The " + bDayCake.getFlavor() + " birthday cake with " + bDayCake.getCandles() + " candles is $" + String.format("%.2f", bDayCake.getPrice()) + ".");

        WeddingCake wedCake = new WeddingCake("vanilla");
        wedCake.setPrice(100);
        wedCake.setTiers(4);

        System.out.println("The " + wedCake.getFlavor() + " wedding cake with " + wedCake.getTiers() + " tiers is $" + String.format("%.2f", wedCake.getPrice()) + ".");

}
}