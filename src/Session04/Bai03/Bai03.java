package Session04.Bai03;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bai03 {

    public static void main(String[] args) {

        // 1. Tạo danh sách giao dịch
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String ngayTao = LocalDate.now().format(formatter);

        // Dùng Stringbuilder
        long startBuilder = System.currentTimeMillis();

        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportBuilder.append("Ngày tạo: ").append(ngayTao).append("\n");

        for (String t : transactions) {
            reportBuilder.append("Giao dịch: ").append(t).append("\n");
        }

        long endBuilder = System.currentTimeMillis();
        long timeBuilder = endBuilder - startBuilder;

        // Dùng phép cộng chuỗi
        long startString = System.currentTimeMillis();

        String reportString = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportString += "Ngày tạo: " + ngayTao + "\n";

        for (String t : transactions) {
            reportString += "Giao dịch: " + t + "\n";
        }

        long endString = System.currentTimeMillis();
        long timeString = endString - startString;

       // Kết quả
        System.out.println(reportBuilder.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeBuilder);
        System.out.println("Số thời gian thực thi đối với String: " + timeString);
    }
}
