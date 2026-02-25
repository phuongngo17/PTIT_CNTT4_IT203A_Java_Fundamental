package HN_K24_CNTT4_NgoThiHoaiPhuong_002.cau1;

import java.util.Scanner;

public class Cau1_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(c + " ");
            }
        }
        System.out.println("Lỗi: không nhập nội dung");
    }
}
