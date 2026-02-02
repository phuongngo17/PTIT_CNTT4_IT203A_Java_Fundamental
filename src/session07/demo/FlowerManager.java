package session07.demo;

public class FlowerManager {
    private static Flower[] flowers = new Flower[100];
    private static int totalFlowers = 0;

    public static void addFlower(Flower f) {
        if (totalFlowers >= flowers.length) {
            System.out.println("Danh sách hoa đã đầy");
            return;
        }
        flowers[totalFlowers++] = f;
    }

    public static void showAllFlowers() {
        if (totalFlowers == 0) {
            System.out.println("Danh sách hoa rỗng");
            return;
        }

        for (int i = 0; i < totalFlowers; i++) {
            flowers[i].showInfo();
        }
    }

    public static Flower findFlowerById(int id) {
        for (int i = 0; i < totalFlowers; i++) {
            if (flowers[i].getId() == id) {
                return flowers[i];
            }
        }
        return null;
    }
}
