package Session03.Baitap5;

import java.util.Scanner;

public class Bai05 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy sách có ID " + bookId);
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;
        return n;
    }

    public static void printBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        System.out.print("Danh sách sách hiện tại: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        printBooks(books, n);

        while (n > 0) {
            System.out.print("Nhập ID sách cần xóa (hoặc -1 để dừng): ");
            int bookId = sc.nextInt();
            if (bookId == -1) break;

            n = deleteBook(books, n, bookId);
            printBooks(books, n);
        }

        sc.close();
    }
}
