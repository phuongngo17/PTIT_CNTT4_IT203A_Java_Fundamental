package session10.baitap02;

public abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();

    public String getBrand() {
        return brand;
    }
}
