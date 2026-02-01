package session06.demo;

import java.util.Date;

public class Demo {
        public static void main(String[] args) {

            Player p1 = new Player();
            p1.setPlayerId("PL001");
            p1.setFullName("Nguyễn Văn A");
            p1.setGender("Nam");
            p1.setBirthDate(new Date());
            p1.setHometown("Hà Nội");
            p1.setPosition("Tiền đạo");
            p1.setTransferValue(1500000);

            Player p2 = new Player(
                    "PL002",
                    "Trần Văn B",
                    "Nam",
                    new Date(),
                    "TP.HCM",
                    "Tiền vệ",
                    2000000
            );

            p1.displayInfo();
            p2.displayInfo();
        }
}

