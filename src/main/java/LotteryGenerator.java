import java.util.Arrays;

public class LotteryGenerator { //Chapter 7b, Searching Arrays (Binary and Sequential Search)

    public static void main(String[] args) {
        int lotteryTicket[] = new int[6];

        for (int i = 0; i < lotteryTicket.length; i++) {
            int generatedNum;
            do{
                generatedNum = (int) (Math.random() * 69 + 1);
            } while(sequentialSearch(lotteryTicket, generatedNum));
            lotteryTicket[i] = generatedNum;
        }
        String ticket = "";
        for(int i = 0; i < lotteryTicket.length; i++){
            ticket += lotteryTicket[i] + " | ";
        }
        System.out.println(ticket.substring(0, ticket.length()-2));
    }

    static boolean sequentialSearch(int[] arr, int checkFor){
        for(int lotteryNum : arr){
            if(lotteryNum == checkFor){
                return true;
            }
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int checkFor){
        Arrays.sort(arr);
        if(Arrays.binarySearch(arr, checkFor) >= 0){
            return true;
        } else{
            return false;
        }

    }
}