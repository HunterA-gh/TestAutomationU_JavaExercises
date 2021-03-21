import java.util.Scanner;

public class DaysOfTheWeek { //Chapter 7c, Arrays


    public static void main(String[] args) {

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        int dayNum;

        while(true) {
            System.out.print("Enter a number: ");
            dayNum = input.nextInt();
            if(dayNum > 7 || dayNum < 1){
                System.out.println(dayNum + " is not a valid number");
            } else{
                break;
            }
        }
        input.close();

        System.out.println(daysOfWeek[dayNum-1]);

    }
}
