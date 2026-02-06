package session09.baitap01;

public class Student extends Person {
    private String studentId;
    private double studentAvg;

    public Student(String studentId, String name,int age, double studentAvg) {
        super(name, age);
        this.studentId = studentId;
        this.studentAvg = studentAvg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("mã sinh viên: "+ studentId);
        System.out.println("Điểm trung bình: "+ studentAvg);
    }
}
