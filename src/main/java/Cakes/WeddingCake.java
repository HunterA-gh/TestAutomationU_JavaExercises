package Cakes;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake(String flavor){
        this.setFlavor(flavor);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
