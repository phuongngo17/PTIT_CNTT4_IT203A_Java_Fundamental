package session16.miniproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("L01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("T02", "Tai nghe", 2000000, 6));

        repo.add(new FoodProduct("B01", "Bánh", 100000, 10));
        repo.add(new FoodProduct("S02", "Sữa", 50000, 5));

        System.out.println("Danh sách sản phẩm:");

        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.printf("Thành tiền: %,.0f\n", p.calculateFinalPrice());
            System.out.println("------------------");
        }
        System.out.println("Tìm sản phẩm L01");

        Product found = repo.findById("L01");

        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy");
        }

        List<Product> list = repo.findAll();

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        System.out.println("Danh sách sau khi sắp xếp:");

        for (Product p : list) {
            p.displayInfo();
            System.out.printf("Thành tiền: %,.0f\n", p.calculateFinalPrice());
            System.out.println("------------------");
        }

        Map<String, Integer> stats = new HashMap<>();

        for (Product p : list) {

            if (p instanceof ElectronicProduct) {
                stats.put("Electronic",
                        stats.getOrDefault("Electronic", 0) + 1);
            }

            if (p instanceof FoodProduct) {
                stats.put("Food",
                        stats.getOrDefault("Food", 0) + 1);
            }
        }

        System.out.println("Thống kê:");

        for (String key : stats.keySet()) {
            System.out.println(key + ": " + stats.get(key));
        }
    }
}