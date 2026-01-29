package HN_KS24_CNTT4_NgoThiHoaiPhuong.miniproject;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Minitest {
    // Mảng lưu danh sách MSSV, tối đa 100 phần tử
    static String[] studentId = new String[100];

    // Biến quản lý số lượng MSSV hiện có trong mảng
    static int currentSize = 0;

    // Biểu thức chính quy: MSSV bắt đầu bằng B và theo sau là đúng 7 chữ số
    static final String Student_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice; // Biến lưu lựa chọn cảu người dùng


        do {
            System.out.println("\n========= QUẢN LÝ MSSV =========");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới (có regex)");
            System.out.println("3. Cập nhật ");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            // Kiểm tra cho người dùng nhập số, tránh lỗi khi nhập ký tự
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    // Hiển thị MSSV
                    if (currentSize == 0) {
                        System.out.println("Danh sách MSSV rỗng");
                    } else {
                        // Duyệt mảng và in ra MSSV kèm STT
                        for (int i = 0; i < currentSize; i++) {
                            System.out.println(" Danh sách MSSV " + (i + 1) + ": " + studentId[i]);
                        }
                    }
                    break;

                case 2://Thêm mới MSSV
                    // Kiểm tra mảng đầy
                    if (currentSize == studentId.length) {
                        System.out.println("Danh sách đã đầy");
                        break;
                    }

                    String newStudentId;
                    // Nhập MSSV cho đến khi đúng Regex
                    do {
                        System.out.print("Nhập MSSV mới: ");
                        newStudentId = scanner.nextLine();
                        if (!Pattern.matches(Student_REGEX, newStudentId)) {
                            System.out.println("Sai định dạng (B + 7 chữ số)");
                        }
                    } while (!Pattern.matches(Student_REGEX, newStudentId));

                    // Thêm MSSV vào cuối mảng
                    studentId[currentSize++] = newStudentId;
                    System.out.println("Thêm MSSV thành công");
                    break;

                case 3:
                    if (currentSize == 0) {
                        System.out.println("Danh sách rỗng");
                        break;
                    }

                    System.out.print("Nhập vị trí cần sửa (1 - " + currentSize + "): ");
                    int index;

                    // Kiểm tra index có hợp lệ
                    try {
                        index = Integer.parseInt(scanner.nextLine()) - 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Vị trí không hợp lệ");
                        break;
                    }

                    if (index < 0 || index >= currentSize) {
                        System.out.println("Vị trí không hợp lệ");
                        break;
                    }

                    String updateStudentId;
                    // Nhập MSSV mới và kiểm tra Regex

                    do {
                        System.out.print("Nhập MSSV mới: ");
                        updateStudentId = scanner.nextLine();
                        if (!Pattern.matches(Student_REGEX, updateStudentId)) {
                            System.out.println("Sai định dạng MSSV");
                        }
                    } while (!Pattern.matches(Student_REGEX, updateStudentId));

                    // Cập nhật MSSV tại vị trí chỉ định
                    studentId[index] = updateStudentId;
                    System.out.println("Cập nhật thành công");
                    break;

                case 4:
                    if (currentSize == 0) {
                        System.out.println("Danh sách rỗng");
                        break;
                    }

                    System.out.print("Nhập MSSV cần xóa: ");
                    String deleteMssv = scanner.nextLine();
                    int deleteIndex = -1;

                    // Tìm vị trí MSSV cần xóa
                    for (int i = 0; i < currentSize; i++) {
                        if (studentId[i].equalsIgnoreCase(deleteMssv)) {
                            deleteIndex = i;
                            break;
                        }
                    }

                    if (deleteIndex == -1) {
                        System.out.println("Không tìm thấy MSSV!");
                        break;
                    }

                    // Dồn các phần tử phía sau lên trước
                    for (int i = deleteIndex; i < currentSize - 1; i++) {
                        studentId[i] = studentId[i + 1];
                    }

                    // Giảm kích thước mảng
                    studentId[--currentSize] = null;

                    System.out.println("Xóa MSSV thành công");
                    break;

                case 5:
                    if (currentSize == 0) {
                        System.out.println("Danh sách rỗng");
                        break;
                    }

                    System.out.print("Nhập chuỗi cần tìm: ");
                    String keyword = scanner.nextLine().toLowerCase();
                    boolean found = false;

                    // Tìm kiếm không phân biệt hoa thường
                    for (int i = 0; i < currentSize; i++) {
                        if (studentId[i].toLowerCase().contains(keyword)) {
                            System.out.println((i + 1) + ". " + studentId[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không có MSSV phù hợp");
                    }
                    break;

                case 6:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        scanner.close();
    }
}
