package Session02.Baitap01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Số sách đang giữ: ");
        int bookId = sc.nextInt();

        if (age >= 18 && bookId < 3) {
            System.out.println("Kết quả: Bạn đủ điều kiện mượn sách quý hiếm");
        } else {
            System.out.println("kết quả: không đủ điều kiện - Lý do: Bạn đã mượn tối đa 3 cuốn");
        }
    }
}
