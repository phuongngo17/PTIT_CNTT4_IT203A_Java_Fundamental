package session02.Baitap01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Số sách đang giữ: ");
        int bookId = sc.nextInt();

        if (age >= 18 && bookId <= 3) {
            System.out.println("Cho phép mượn sách");
        } else{
            if (age < 18) {
                System.out.println("Bạn chưa đủ tuổi");
            } else if (bookId > 3) {
                System.out.println("Bạn đã mượn quá số lượng cho phép");
            } }
    }
}
