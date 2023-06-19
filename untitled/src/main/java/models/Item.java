package models;

public class Item {

    private String name;
    private double price;
    private boolean buyOneGetOneFreeEligible;

    public Item(String name, double price, boolean buyOneGetOneFreeEligible) {
        this.name = name;
        this.price = price;
        this.buyOneGetOneFreeEligible = buyOneGetOneFreeEligible;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBuyOneGetOneFreeEligible() {
        return buyOneGetOneFreeEligible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuyOneGetOneFreeEligible(boolean buyOneGetOneFreeEligible) {
        this.buyOneGetOneFreeEligible = buyOneGetOneFreeEligible;
    }
}
