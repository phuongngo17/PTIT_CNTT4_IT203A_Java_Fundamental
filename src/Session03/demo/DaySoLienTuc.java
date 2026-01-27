package Session03.demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DaySoLienTuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int maxLength = 1;
        int endIndex = 0;

        // Biến tạm
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                endIndex = i;
            }
        }

        System.out.println("Dãy con tăng có số phần tử lớn nhất là:");
        for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSố phần tử dãy con tăng là: " + maxLength);
    }
}

