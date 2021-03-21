package PhoneBillCalculator2;

public class PhoneBill { //Chapter 7d, Overloading Objects/Methods

    private String ID;
    private double baseCost;
    private int numberOfAllottedMinutes;
    private int numberOfMinutesUsed;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfAllottedMinutes() {
        return numberOfAllottedMinutes;
    }

    public void setNumberOfAllottedMinutes(int numberOfAllottedMinutes) {
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
    }

    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public PhoneBill() {
    }

    public PhoneBill(String ID) {
        this.ID = ID;
    }

    public PhoneBill(String ID, double baseCost, int numberOfAllottedMinutes, int numberOfMinutesUsed) {
        this.ID = ID;
        this.baseCost = baseCost;
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public double overageCost() {
        int minutesLeft = this.numberOfAllottedMinutes - this.numberOfMinutesUsed;
        if (minutesLeft >= 0) {
            return 0;
        } else {
            int minutesOver = Math.abs(minutesLeft);
            double overageCost = minutesOver * 0.25;
            return overageCost;
        }
    }

    public double tax(double base, double overage) {
        double preTaxCost = base + overage;
        return preTaxCost * 0.15;
    }

    public double total(double base, double overage, double tax) {
        return base + overage + tax;
    }

    public void printBill() {
        System.out.println("Phone Bill Statement for " + this.getID());
        System.out.println("Plan: " + String.format("%4s" + "%.2f", "$", this.getBaseCost()));
        System.out.println("Overage: " + String.format("%s" + "%.2f", "$", this.overageCost()));
        System.out.println("Tax: " + String.format("%5s" + "%.2f", "$", this.tax(this.getBaseCost(), this.overageCost())));
        System.out.println("Total: " + String.format("%3s" + "%.2f", "$", this.total(this.getBaseCost(), this.overageCost(), this.tax(this.getBaseCost(), this.overageCost()))));
    }

}

