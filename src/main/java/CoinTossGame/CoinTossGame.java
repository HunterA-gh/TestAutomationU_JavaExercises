package CoinTossGame;

import static CoinTossGame.Coin.flip;

public class CoinTossGame { //Chapter 14, Final project

    public static void main(String[] args) {
        Player p1 = new Player("Player1");
        Player p2 = new Player("Player2");
        assignGuesses(p1, p2);
        String gameFlip = flip();
        System.out.println("Player one guessed " + p1.getGuess() + ".");
        System.out.println("Player two guessed " + p2.getGuess() + ".");
        if(p1.getGuess() == gameFlip){
            System.out.println("The flip landed on " + gameFlip + ". Player one wins!");
        } else if (p2.getGuess() == gameFlip){
            System.out.println("The flip landed on " + gameFlip + ". Player two wins!");
        } else {
            System.out.println("I messed up somewhere.");
        }

    }

     static void assignGuesses(Player one, Player two){
        one.setGuess(flip());
        do{
            two.setGuess(flip());
        } while(one.getGuess() == two.getGuess());
    }
}
