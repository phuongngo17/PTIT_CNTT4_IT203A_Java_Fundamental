package session08.mini_project;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private String gender;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private double averageScore;
    private String rank;

    public Student(String studentId, String fullName, int age, String gender,
                   double mathScore, double physicsScore, double chemistryScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        calculateAverage();
        classify();
    }

    private void calculateAverage() {
        averageScore = (mathScore + physicsScore + chemistryScore) / 3;
    }

    private void classify() {
        if (averageScore >= 8 && mathScore >= 6.5 && physicsScore >= 6.5 && chemistryScore >= 6.5) {
            rank = "Giỏi";
        } else if (averageScore >= 6.5 && mathScore >= 5 && physicsScore >= 5 && chemistryScore >= 5) {
            rank = "Khá";
        } else if (averageScore >= 5) {
            rank = "Trung bình";
        } else {
            rank = "Yếu";
        }
    }

    public String getStudentId() {
        return studentId;
    }
}

