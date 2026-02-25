package HN_K24_CNTT4_NgoThiHoaiPhuong_002.cau2;

import java.util.Scanner;

public class Cau2_Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        if (index >= 0 && index < n) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.println("Vị trí không hợp lệ");
        }
        sc.close();
    }
}
