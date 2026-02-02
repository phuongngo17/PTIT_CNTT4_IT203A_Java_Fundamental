package session07.baitap01;

public class Student {
    private int studentId;
    private String studentName;
    private static int totalStudent = 0;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }
    public void display() {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Student: " + totalStudent);
    }
}
