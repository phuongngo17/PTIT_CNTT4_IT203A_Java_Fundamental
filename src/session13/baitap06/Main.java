package session13.baitap06;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Medicine> cart = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm thuốc");
            System.out.println("2.Cập nhật số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. Hiển Thị");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addMedicine(); break;
                case 2: updateQuantity(); break;
                case 3: removeMedicine(); break;
                case 4: printInvoice(); break;
                case 5: findCheapMedicine(); break;
                case 6:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn sai vui lòng nhập lại");
            }
        }
    }

    public static void addMedicine() {
        System.out.print("Nhập id thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhập số lượng bổ sung: ");
                int extraQty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + extraQty);
                System.out.println("Cập nhật số lượng (thêm) thành công");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công!");
    }

    public static void updateQuantity() {
        while (true) {
            System.out.print("Nhập id để cập nhật: ");
            String id = sc.nextLine();

            for (Medicine m : cart) {
                if (m.getDrugId().equalsIgnoreCase(id)) {

                    System.out.print("Nhập số lượng mới: ");
                    int newQty = Integer.parseInt(sc.nextLine());

                    if (newQty == 0) {
                        cart.remove(m);
                        System.out.println("Thuốc đã bị loại bỏ vì số lượng = 0");
                    } else {
                        m.setQuantity(newQty);
                        System.out.println("Cập nhật số lượng thành công");
                    }
                    return;
                }
            }

            System.out.println("Không tìm thấy thuốc! Vui lòng nhập lại.");
        }
    }

    public static void removeMedicine() {
        System.out.print("Nhập id cần xóa: ");
        String id = sc.nextLine();

        Iterator<Medicine> iterator = cart.iterator();

        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                iterator.remove();
                System.out.println("Thuốc đã được gỡ bỏ thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy mã thuốc");
    }

    public static void printInvoice() {

        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng trống");
            return;
        }

        double total = 0;

        System.out.println("\n=========== HÓA ĐƠN ===========");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n",
                "ID", "Name", "Price", "Qty", "Total");

        for (Medicine m : cart) {
            m.display();
            total += m.getTotalPrice();
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Tổng tiền: %.0f VND\n", total);

        cart.clear();
        System.out.println("Giỏ hàng đã được làm trống cho đơn hàng tiếp theo");
    }

    public static void findCheapMedicine() {

        boolean found = false;

        System.out.println("\nThuốc rẻ (<50.000 VND):");

        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                m.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy thuốc rẻ!");
        }
    }
}