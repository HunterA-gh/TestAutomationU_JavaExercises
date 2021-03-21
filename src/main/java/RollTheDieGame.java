public class RollTheDieGame { //Chapter 4d, Loops


    public static void main(String[] args) {

        int dieRolls = 5;
        int boardSpaces = 20;
        int playersTotal = 0;
        int spacesLeft = boardSpaces;

        for(int i = 1; i <= dieRolls; i++){
            int currentRoll = (int) (Math.random() * 6 + 1);
            playersTotal += currentRoll;
            spacesLeft -= currentRoll;


            if(playersTotal == boardSpaces){
                System.out.println("Roll #" + i + " You've rolled a " + currentRoll + ". You are now on space " + playersTotal + ". Congrats, you win!");
                break;
            } else if(playersTotal >= boardSpaces){
                System.out.println("Roll #" + i + ": You've rolled a " + currentRoll + ". Your final score is " + playersTotal + ". You lose!");
                break;
            } else if(playersTotal < boardSpaces && i < dieRolls){
                System.out.println("Roll #" + i + ": You've rolled a " + currentRoll + ". You are now on space " + playersTotal + " and have " + spacesLeft + " more to go.");
            } else{
                System.out.println("Roll #" + i + ": You've rolled a " + currentRoll + ". Your final score is " + playersTotal + ". You lose!");
            }
        }
    }
}
