package session04.Bai04;

public class Bai04 {
    public static void main(String[] args) {
        String card = "TV20231234a";

        if (!card.matches("^[A-Z]{2}.*")) {
            System.out.println("Thiếu hoặc sai tiền tố (2 chữ cái viết hoa)");
        } else if (!card.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Năm không hợp lệ");
        } else if (!card.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
            System.out.println("5 ký tự cuối phải là số");
        } else {
            System.out.println("Mã thẻ hợp lệ");
        }
    }
}

