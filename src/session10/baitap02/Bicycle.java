package session10.baitap02;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " - Cách di chuyển: Di chuyển bằng sức người");
    }
}
