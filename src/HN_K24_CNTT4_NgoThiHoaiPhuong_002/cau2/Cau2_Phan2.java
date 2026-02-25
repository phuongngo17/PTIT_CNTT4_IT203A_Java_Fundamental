package HN_K24_CNTT4_NgoThiHoaiPhuong_002.cau2;

import java.util.Scanner;

public class Cau2_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expected = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expected - actualSum;
        System.out.println("Số còn thiếu: " + missingNumber);
        sc.close();
    }
}
