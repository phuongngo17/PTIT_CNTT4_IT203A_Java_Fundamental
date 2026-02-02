package session07.baitap03;

public class ScoreUtils {
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    // Phương thức tính trung bình cộng
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }
}
