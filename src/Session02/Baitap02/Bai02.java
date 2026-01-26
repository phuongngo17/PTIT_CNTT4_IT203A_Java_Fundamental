package Session02.Baitap02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một ký tự code: ");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách Văn Học");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2 - Sách Khoa Học");
                break;
            case 'C':
                System.out.println("Vị Trí: Tầng 3 - Sách Ngoại Ngữ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4 - Sách Tin Học");
                break;
            default:
                System.out.println("Mã không hợp lệ");

        }
    }
}
