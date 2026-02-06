package session01.Baitap6;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = input.nextInt();

        int bookshelf = (stt -1 ) /25 + 1;
        int position = (stt -1) % 25 + 1;

        String area = (bookshelf < 10) ? "khu cận (Gần cửa) ":"khu viễn (Xa cửa)";

        System.out.println("==== Thông tin định vị ====");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: kệ " + bookshelf + " - Vị trí " + position);
        System.out.println("Phân khu: " + area);
    }
}
