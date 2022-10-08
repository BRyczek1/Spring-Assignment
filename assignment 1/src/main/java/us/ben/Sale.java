package us.ben;

public class Sale {
    //Stacey Read, United States, 190.95,10.45
    private String name;
    private String country;
    private double cost;
    private double tax;

    public Sale(String name, String country, double cost, double tax) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.tax = tax;
    }
}
