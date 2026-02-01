package session06.demo;

import java.util.Date;

public class Player {
    private String playerId;
    private String fullName;
    private String gender;
    private Date birthDate;
    private String hometown;
    private String position;
    private double transferValue;

    public Player() {
    }

    public Player(String playerId, String fullName, String gender,Date birthDate, String hometown, String position,double transferValue) {
        this.playerId = playerId;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hometown = hometown;
        this.position = position;
        this.transferValue = transferValue;
    }

    public void displayInfo() {
        System.out.println("Mã cầu thủ: " + playerId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Quê quán: " + hometown);
        System.out.println("Vị trí thi đấu: " + position);
        System.out.println("Giá trị chuyển nhượng: " + transferValue);
        System.out.println("-----------------------------");
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTransferValue(double transferValue) {
        this.transferValue = transferValue;
    }
}
