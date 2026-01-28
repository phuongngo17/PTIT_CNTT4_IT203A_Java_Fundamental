package Session04.Bai01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên sách: ");
        String book = sc.nextLine();

        System.out.println("Nhập tác giả: ");
        String title = sc.nextLine();

        book = book.trim().toUpperCase();

        String [] arr = title.split(" ");
        String result = "";

        for(String sb : arr){
            result += sb.substring(0, 1).toUpperCase() + sb.substring(1) + " ";
        }
        System.out.println("[" + book + "] " + " - Tác giả: " + result.trim());
    }
}
