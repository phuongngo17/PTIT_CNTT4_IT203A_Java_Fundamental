package Session02.Baitap05;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reputation = 100;
        int days;
        while (true) {
            System.out.println("Nhập số ngày trễ (999 để thoát): ");
            days = sc.nextInt();
            if (days == 999) break;

            System.out.println("số ngày trễ lần này: " + days);
            if (days <= 0) {
                reputation += 5;
            } else {
                int point = days * 2;
                reputation -= point;
                System.out.println("Trả trễ " + days + " ngày: -" + point + " Điểm");
            }
        }
        System.out.println("Tổng điểm uy tín: " + reputation);

        if (reputation > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (reputation >= 80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }
    }
}


