package session13.baitap05;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> patientList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    admitPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn sai vui lòng nhập lại");
            }
        }
    }

    public static void admitPatient() {
        System.out.print("Nhập id: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("id đã tồn tại");
                return;
            }
        }

        System.out.print("Nhập tên ");
        String name = sc.nextLine();

        System.out.print("Nhậptuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Chuẩn đoán bệnh: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Bệnh nhân đã được nhập viện thành công");
    }

    public static void updateDiagnosis() {
        System.out.print("Nhập id cần cập nhật: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật chẩn đoán thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân");
    }

    public static void dischargePatient() {
        System.out.print("Nhập ID để xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Bệnh nhân đã xuất viện thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy ID bệnh nhân!");
    }

    public static void sortPatients() {

        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Danh sách bệnh nhân đã sắp xếp:");
        for (Patient p : patientList) {
            p.display();
        }
    }
}
