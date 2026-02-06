package session09.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Nhập thông tin chim ----");
        Bird bird = new Bird();
        bird.input();
        System.out.println("\n--- Thông tin chim ---");
        bird.display();

        System.out.println("\n---- Nhập thông tin động vật có vú ----");
        MamalAnimal mamal = new MamalAnimal();
        mamal.input();
        System.out.println("\n--- Thông tin động vật có vú ---");
        mamal.display();
    }
}
