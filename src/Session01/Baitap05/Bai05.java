package Session01.Baitap05;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số ): ");
        int book = input.nextInt();

        int thousands = book / 1000;
        int hundreds = (book / 100) % 10;
        int dozens = (book / 10) % 10;
        int units = book % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens ;
        System.out.println("chữ số kiểm tra kỳ vọng: " + sumOfFirstThreeNumber);
        boolean isValid = (sumOfFirstThreeNumber  % 10 == units );

        System.out.println("Kết quả kiểm tra mã sách: " + isValid );
        input.close();
    }
}
