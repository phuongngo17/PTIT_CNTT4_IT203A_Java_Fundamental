package session02.Baitap04;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID;
        do {
            System.out.println("Nhập mã sách mới (ID): ");
            ID = sc.nextInt();
            if (ID <= 0) {
                System.out.println("Lỗi: ID phải là số nguyên. Mời nhập lại");
            }
        } while (ID <= 0);
        System.out.println("Xác nhận: Mã sách " + ID + " đã được ghi nhận");
    }
}
