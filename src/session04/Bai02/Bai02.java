package session04.Bai02;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        if(description.contains("Kệ")){
            int start = description.indexOf("Kệ") + 3;
            int end = description.indexOf(",", start);

            if(end == -1){
                end = description.length();
            }
            String title = description.substring(start, end).trim();
            System.out.println("Vị trí tìm thấy: " + title);

            String newdes = description.replace("Kệ: ", "Vị trí lưu trữ: ");
            System.out.println("Mô tả mới: " + newdes);
        }else{
            System.out.println("Không tìm thấy kệ sách");
        }


    }
}
