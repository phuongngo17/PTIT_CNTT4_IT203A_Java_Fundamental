package Session03.Baitap4;

import java.util.Scanner;

public class Bai04 {
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int value : arr) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần tử: ");
        int n = sc.nextInt();


        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortBooks(arr);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        displayBooks(arr);

    }
}
