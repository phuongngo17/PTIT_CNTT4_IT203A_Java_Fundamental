package session07.demo;

public class Demoflower {
    public static void main(String[] args) {

        Flower f1 = new Flower(1, "Rose", "Vietnam");
        Flower f2 = new Flower(2, "Lily", "Japan");
        Flower f3 = new Flower(3, "Tulip", "Netherlands");
        Flower f4 = new Flower(4, "Sunflower", "USA");
        Flower f5 = new Flower(5, "Orchid", "Thailand");

        FlowerManager.addFlower(f1);
        FlowerManager.addFlower(f2);
        FlowerManager.addFlower(f3);
        FlowerManager.addFlower(f4);
        FlowerManager.addFlower(f5);

        System.out.println("----- DANH SÁCH HOA -----");
        FlowerManager.showAllFlowers();

        System.out.println("\n---- TÌM HOA ID = 3 ----");
        Flower found = FlowerManager.findFlowerById(3);
        if (found != null) {
            found.showInfo();
        } else {
            System.out.println("Không tìm thấy flower");
        }
    }
}

