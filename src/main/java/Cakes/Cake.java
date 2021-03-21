package Cakes;

public class Cake { //Chapter 9d, Inheritance
    private String flavor;
    public double price;

    public Cake(){}

    public Cake(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
