package session07.baitap02;

import session07.baitap02.Students;

public class Bai02 {
    public static void main(String[] args) {
        // ----------- Biến nguyên thủy -----------
        int a = 10;
        int b = a;// sao chép giá trị
        System.out.println("Ban đầu: a = " + a + ", b = " + b);
        a = 20; // thay đổi giá trị a
        System.out.println("Sau khi đổi a = 20:");
        System.out.println("a = " + a + ", b = " + b); // b vẫn giữ giá trị cũ

        // ----------- Biến tham chiếu -----------
        Students s1 = new Students("SV01", "An");
        Students s2 = s1; // sao chép địa chỉ tham chiếu
        System.out.println("\nBan đầu:");
        s1.displayStudent();
        s2.displayStudent();
        // Thay đổi thông tin qua s1
        s1.setStudentName("Bình");
        System.out.println("\nSau khi đổi tên qua s1:");
        s1.displayStudent();
        s2.displayStudent();
        // s2 cũng thay đổi theo vì cùng trỏ đến một đối tượng
    }
}
