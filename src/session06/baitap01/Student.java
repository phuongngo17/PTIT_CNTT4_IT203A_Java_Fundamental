package session06.baitap01;

import java.util.Date;

public class Student {
            private String studentId;
            private String studentName;
            private Date studentBirth;
            private double studentAvg;
            public Student(String studentId,String studentName,Date studentBirth,double studentAvg ){
                this.studentId = studentId;
                this.studentName = studentName;
                this.studentBirth = studentBirth;
                this.studentAvg = studentAvg;
            }
            // hàm getter
            public String getStudent() {
                return studentId;
            }
            // hàm hiển thị
            public void display() {
                System.out.println("Mã sinh viên: " + studentId);
                System.out.println("Tên sinh viên: " + studentName);
                System.out.println("Ngày sinh: " + studentBirth);
                System.out.println("Điểm trung bình: "  + studentAvg);
            }
}
