package session16.miniproject;

public abstract class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateFinalPrice();
    public void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Price: %.0f\n", price);
    }
    public String getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
}
