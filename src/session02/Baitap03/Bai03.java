package session02.Baitap03;

import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        System.out.println("Nhập số lượng sách trả muộn n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập số ngày trễ của cuốn sách thứ: " + i);
            int dayList = sc.nextInt();
            total += dayList * 5000;
        }
        System.out.println("Tổng tiền phạt: " + total + " VNĐ");
    }
}
