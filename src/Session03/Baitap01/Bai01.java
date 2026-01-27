package Session03.Baitap01;

import java.util.Scanner;

public class Bai01 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }

    public static void displayLibraries(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sách: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);
        System.out.println("--- Kết quả ---");
        System.out.println("Danh sách mã sách: ");
        displayLibraries(libraries);
    }
}
