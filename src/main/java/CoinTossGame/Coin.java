package CoinTossGame;

public class Coin {
    private static final String HEADS = "heads";
    private static final String TAILS = "tails";
    private static String side;


    public static String flip(){

        int coinSide = (int) (Math.random() * 2 +1);
        if(coinSide == 1){
            side = HEADS;
        } else if(coinSide == 2){
            side = TAILS;
        }
        return side;
    }
}
