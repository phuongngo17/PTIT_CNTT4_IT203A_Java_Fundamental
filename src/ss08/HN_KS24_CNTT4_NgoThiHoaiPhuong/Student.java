package ss08.HN_KS24_CNTT4_NgoThiHoaiPhuong;

public class Student {
    private String studentId;
    private String fullName;
    private double score;

    //1 Constructor không tham số
    public Student(){

    }
    //1 Constructor có tham số
    public Student(String studentId, String fullName, double score) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.score = score;
    }

    //Getters & Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //Phương thức getRank() trả về xếp loại học lực (String)
    public String getRank(){
        if (score >=8.0){
            return "Giỏi";
        }else if (score < 8.0 && score >=6.5){
            return "Khá";
        } else{
            return "Trung bình";
        }

    }

    //Phương thức toString(): Hiển thị đúng format
    public String toString(){
        return "Id: " + studentId + " | Tên sinh viên: " + fullName + " | Điểm Trung bình: " + score + " |  Học lực: " + getRank();
    }
}
