package Session02.Baitap06;

import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Nhập số lượt mượn sách: ");
            int n = sc.nextInt();
            if (n == 0) {
                continue;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            sum += n;
            count++;
        }
        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);
        System.out.println("Trung bình lượt mượn/ngày: " + avg);
        sc.close();
    }
}