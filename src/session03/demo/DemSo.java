package session03.demo;

import java.util.Scanner;

public class DemSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        boolean[] area = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSố lần xuất hiện của từng phần tử:");

        for (int i = 0; i < n; i++) {
            if (area[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    area[j] = true;
                }
            }
            System.out.println(a[i] + " xuất hiện " + count + " lần");
        }
    }
}
