package session06.baitap06;

public class Bai06 {
    public static void main(String[] args) {

        // Trường hợp đúng
        User u1 = new User(1, "admin", "123456", "admin@gmail.com");
        u1.displayInfo();

        // Email sai
        User u2 = new User(2, "user01", "abc123", "user01gmail.com");
        u2.displayInfo();

        // Password rỗng
        User u3 = new User(3, "user02", "", "user02@gmail.com");
        u3.displayInfo();

        // Set lại dữ liệu sai
        u1.setEmail("sai_email");
        u1.setPassword("   ");
    }
}
