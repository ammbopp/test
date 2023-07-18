package ku.cs.models;
public class Shoes {
    private String name;
    private double price; // Assume price is in USD
    private double size;

    // Constructor
    public Shoes(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPriceInUSD() {
        return "" + price;
    }

    public String getSizeInCm() {
        return "" +size;
    }

    // Method to convert price from USD to THB
    public String getPriceInTHB() {
        return "" + (price * 34);
    }

}

