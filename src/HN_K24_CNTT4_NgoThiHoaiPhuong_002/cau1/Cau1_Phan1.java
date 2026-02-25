package HN_K24_CNTT4_NgoThiHoaiPhuong_002.cau1;

import java.util.Scanner;

public class Cau1_Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập từ bàn phím: ");
        String input = sc.nextLine();

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    standardize(word, result);
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            standardize(word, result);
        }

        System.out.println(result.toString().trim());
        System.out.println("Lỗi: không nhập nội dung");
    }

    public static void standardize(StringBuilder word, StringBuilder result) {
        result.append(Character.toUpperCase(word.charAt(0)));

        for (int i = 1; i < word.length(); i++) {
            result.append(Character.toLowerCase(word.charAt(i)));
        }

        result.append(" ");
    }
}
