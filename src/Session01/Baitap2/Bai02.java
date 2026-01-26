package Session01.Baitap2;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ngày trễ: ");
        int n = sc.nextInt();

        System.out.println("Số lượng sách mượn: ");
        int m = sc.nextInt();

        double total = n * m* 5000;
        System.out.println("Tiền phạt gốc: " + total);

        if( n > 7 && m >= 3){
            total = total * 1.2;
        }
        System.out.printf("Tiền phạt sau khi điều chỉnh: %.2f\n ", total);

        boolean lock = total > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + lock);
        sc.close();

    }
}
