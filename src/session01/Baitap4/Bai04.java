package session01.Baitap4;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập giá sách(USD - kiểu double ): ");
        double bookshelf = input.nextDouble();

        System.out.println("Tỷ giá: ");
        float exchangerate = input.nextFloat();

        double total = bookshelf * exchangerate;
        System.out.printf("Giá chính xác (số thực): %.2f%n",total);

        long book = (long) total;
        System.out.println("Giá làm tròn để thanh toán (long): " + book);
    }
}
