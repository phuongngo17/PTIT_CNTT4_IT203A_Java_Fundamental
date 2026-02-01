package session06.baitap01;

import java.util.Date;

public class Bai01 {
    public static void main(String[] args) {
        Student sv1 = new Student("001" ,"Nguyễn Văn A" , new Date(), 7.4);
        Student sv2 = new Student("002" ,"Nguyễn Thị B" , new Date(), 8.5);
        sv1.display();
        sv2.display();
    }
}
