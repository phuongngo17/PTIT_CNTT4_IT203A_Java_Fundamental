package session09.baitap06;

import java.util.ArrayList;
import java.util.List;

public class Bai06 {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6));

        double totalArea = 0;

        System.out.println("Kết quả tính toán hình học:\n");

        int index = 1;
        for (Shape s : shapes) {
            double area = s.calculateArea();
            totalArea += area;

            System.out.println(
                    index + ". " + s.getName() +
                            " - Diện tích: " +
                            String.format("%.2f", area)
            );
            System.out.println();
            index++;
        }

        System.out.println("=> Tổng diện tích các hình: " +
                String.format("%.2f", totalArea));
    }
}
