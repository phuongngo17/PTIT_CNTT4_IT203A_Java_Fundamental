package session14.baitap02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("T01", "Paracetamol");
        map.put("T02", "Ibuprofen");
        map.put("T03", "Metformin");
        map.put("T04", "Cetirizine");
        map.put("T05", "Lisinopril");

        System.out.println("Nhập mã thuốc: ");
        String key = sc.nextLine();

        if(map.containsKey(key)){
            System.out.println("Tên thuốc: " + map.get(key));
        }else{
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
