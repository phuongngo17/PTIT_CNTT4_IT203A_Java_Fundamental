package session06.baitap02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account admin = new Account("admin123", "123456789" , "admin1@gmail.com");

        admin.displayAccount();

        System.out.println("Nhập mật khẩu cũ: ");
        String old = sc.nextLine();

        System.out.println("Nhập mật khẩu mới: ");
        String new_password = sc.nextLine();

        admin.changePassword(old, new_password);

        admin.displayAccount();
    }
}
