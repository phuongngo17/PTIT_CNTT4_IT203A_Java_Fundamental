package Session01.Baitap1;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhập mã sách:");
        String bookID = input.nextLine();
        System.out.println("Nhập tên sách:");
        String bookName = input.nextLine();
        System.out.println("Nhập năm xuất bản:");
        int publisherID = input.nextInt();
        System.out.println("Nhập giá bìa: ");
        double price = input.nextDouble();
        System.out.println("Sách còn trong kho (true/false): ");
        boolean isAvailabe = input.nextBoolean();

        int age = 2026 - publisherID;

        System.out.println("==== Phiếu thông tin sách ====");
        System.out.println("Tên sách: " + bookName);
        System.out.println("Mã số: " + bookID +  " | Tuổi thọ: " + age + "năm") ;
        System.out.println("Giá bán: %.2f\n" + price + "VNĐ");
        System.out.println("Tình trạng: " + (isAvailabe?"đang còn":"Hết sách"));
    }
}
