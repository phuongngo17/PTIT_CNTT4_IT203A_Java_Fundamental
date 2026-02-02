package session07.baitap03;

public class Bai03 {
    public static void main(String[] args) {
        double[] score = {6.5, 8.0, 4.5};

        System.out.printf("Danh sách điểm: ");
        for (int i = 0; i < score.length; i++) {
            System.out.printf(score[i] + " ");
            if(i < score.length-1){
                System.out.printf(", ");
            }
        }

        double avg = ScoreUtils.calculateAverage(score);
        System.out.println("\n----- Kết quả xử lý -----");
        System.out.printf("Điểm trung bình cả lớp: %.2f\n" , avg);

        for(double i : score){
            if(ScoreUtils.checkPass(i)){
                System.out.printf("Điểm " + i + " Đạt \n");
            }else{
                System.out.println("Điểm " + i + " Trượt");
            }
        }
    }

}
