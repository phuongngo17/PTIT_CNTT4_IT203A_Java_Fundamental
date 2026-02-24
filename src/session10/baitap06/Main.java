package session10.baitap06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 20000));
        products.add(new Product("Phone", 15000));
        products.add(new Product("Tablet", 18000));

        Collections.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần (Anonymous Class):");
        for (Product p : products) {
            System.out.println(p);
        }
        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\nSắp xếp theo tên A-Z (Lambda):");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
