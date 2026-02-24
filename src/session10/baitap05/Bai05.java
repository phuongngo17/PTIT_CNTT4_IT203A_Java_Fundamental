package session10.baitap05;

public class Bai05 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new OfficeStaff("Nguyen Van A", 8000000);
        employees[1] = new Manager("Tran Thi B", 12000000, 5000000);

        System.out.println("---- BẢNG LƯƠNG NHÂN VIÊN ----");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("-----------------------------");
            System.out.println("Tên: " + employees[i].getName());
            System.out.println("Lương cơ bản: " + employees[i].getBaseSalary());

            if (employees[i] instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) employees[i];
                System.out.println("Thưởng: " + b.getBonus());
            } else {
                System.out.println("Thưởng: Không có");
            }

            System.out.println("=> Lương thực nhận: " + employees[i].calculateSalary());
        }
    }
}
