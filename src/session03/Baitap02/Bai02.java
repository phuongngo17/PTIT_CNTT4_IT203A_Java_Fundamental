package session03.Baitap02;

import java.util.Scanner;

public class Bai02 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Lập trình Java",
                "Cấu trúc dữ liệu",
                "Cơ sở dữ liệu",
                "Thuật toán",
                "Hệ điều hành"
        };
        System.out.println("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);
        if (result != -1) {
            System.out.println("Tìm thấy sách " + search + " tại vị trí " + result);
        }
    }

}
