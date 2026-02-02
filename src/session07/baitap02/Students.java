package session07.baitap02;

public class Students {
    String studentId;
    String studentName;

    public Students(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void displayStudent() {
        System.out.println("Id: "+ studentId);
        System.out.println("Name: "+ studentName);
    }
}
