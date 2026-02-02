package session07.baitap05;

public class Bai05 {
    public static void main(String[] args) {
        int score = 85;

        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}

