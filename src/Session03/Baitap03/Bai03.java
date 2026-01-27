package Session03.Baitap03;

import java.util.Scanner;

public class Bai03 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = 0;
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > quantities[max]) {
                max = i;
            }
        }
        System.out.println("Sách nhiều nhất: " + names[max] + " | Số lượng: " + quantities[max]);
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = 0;
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < quantities[min]) {
                min = i;
            }
        }
        System.out.println("Sách ít nhất: " + names[min] +
                " | Số lượng: " + quantities[min]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {
                "Lập trình Java",
                "Cấu trúc dữ liệu",
                "Cơ sở dữ liệu",
                "Thuật toán",
                "Hệ điều hành"
        };

        int[] quantities = {
                10,  // Lập trình Java
                5,   // Cấu trúc dữ liệu
                8,   // Cơ sở dữ liệu
                3,   // Thuật toán
                6    // Hệ điều hành
        };

        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);

    }
}
