import java.util.Scanner;

public class PhoneBillCalculator1 { //Chapter 5b, Methods/Variable Scope


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base cost of plan: $");
        double baseCost = input.nextDouble();

        System.out.print("Enter overage minutes: ");
        int overageMinutes = input.nextInt();

        input.close();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + String.format("%4s" + "%.2f", "$", baseCost));
        System.out.println("Overage: " + String.format("%s" + "%.2f", "$", costPerMinOver(overageMinutes)));
        System.out.println("Tax: " + String.format("%5s" + "%.2f", "$", tax(baseCost, costPerMinOver(overageMinutes))));
        System.out.println("Total: " + String.format("%3s" + "%.2f", "$", finalTotal(baseCost, costPerMinOver(overageMinutes), tax(baseCost, costPerMinOver(overageMinutes)))));

    }

    static double costPerMinOver(int minOver){
        return minOver * 0.25;
    }

    static double tax(double base, double overageCost){
        double preTaxTotal = base + overageCost;
        return preTaxTotal * 0.15;
    }

    static double finalTotal(double base, double overageCost, double tax){
        return base + overageCost + tax;
    }


}
