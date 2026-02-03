package session08.mini_project;

import java.util.Scanner;

public class Mini_project {
    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("------ Quản Lý Sinh Viên ------");
            System.out.println("1.Thêm sinh viên mới\n");
            System.out.println("2. Hiển thị tất cả sinh viên\n");
            System.out.println("3. Tìm kiếm sinh viên\n");
            System.out.println("4. Cập nhật thông tin sinh viên\n");
            System.out.println("5.Xóa sinh viên\n");
            System.out.println("6. Tính điểm trung bình và xếp loại\n");
            System.out.println("7. Sắp xếp sinh viên\n");
            System.out.println("8. Thống kê\n");
            System.out.println("9. Thoát\n");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");


            }
        }while(choice != 9);
    }
    static void addStudent() {
        System.out.print("Nhập mã sinh viên: ");
        String studentId = sc.nextLine();

        System.out.print("Nhập họ tên: ");
        String fullName = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 18 || age > 30) {
            System.out.println("Tuổi phải từ 18 đến 30");
            return;
        }

        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm Lý: ");
        double physicsScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm Hóa: ");
        double chemistryScore = Double.parseDouble(sc.nextLine());

        if (mathScore < 0 || mathScore > 10 || physicsScore < 0 || physicsScore > 10 || chemistryScore < 0 || chemistryScore > 10) {
            System.out.println("Điểm phải trong khoảng 0 - 10");
            return;
        }

        Student student = new Student(
                studentId, fullName, age, gender,
                mathScore, physicsScore, chemistryScore
        );

        System.out.println(
                manager.addStudent(student) ? "Thêm sinh viên thành công" : "Mã sinh viên đã tồn tại"
        );
    }

}
