package session06.demo;

public class DemoSinger {
    public static void main(String[] args) {
        // Đối tượng 1: constructor không tham số
        Singer singer1 = new Singer();
        singer1.setSingerId("S01");
        singer1.setFullName("Sơn Tùng M-TP");
        singer1.setGender("Nam");
        singer1.setBirthDate("05/07/1994");
        singer1.setHometown("Thái Bình");
        singer1.setStartYear(2012);
        singer1.setField("Nhạc trẻ");

        // Đối tượng 2: constructor có tham số
        Singer singer2 = new Singer(
                "S02",
                "Mỹ Tâm",
                "Nữ",
                "16/01/1981",
                "Đà Nẵng",
                2001,
                "Nhạc pop"
        );

        // Hiển thị thông tin
        System.out.println("=== THÔNG TIN CA SĨ 1 ===");
        singer1.display();

        System.out.println("\n=== THÔNG TIN CA SĨ 2 ===");
        singer2.display();
    }
}
