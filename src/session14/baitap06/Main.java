package session14.baitap06;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Lan", 30, "Tim mạch"));
        patients.add(new Patient("Hùng", 40, "Nội tiết"));
        patients.add(new Patient("Mai", 25, "Tim mạch"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {

            if (!departmentMap.containsKey(p.getDepartment())) {
                departmentMap.put(p.getDepartment(), new ArrayList<>());
            }

            departmentMap.get(p.getDepartment()).add(p);
        }

        System.out.println("Danh sách bệnh nhân theo khoa:");

        for (String dept : departmentMap.keySet()) {
            System.out.println("Khoa " + dept + " -> " + departmentMap.get(dept));
        }

        String searchDept = "Tim mạch";

        System.out.println("\nBệnh nhân khoa " + searchDept + ":");
        if (departmentMap.containsKey(searchDept)) {
            for (Patient p : departmentMap.get(searchDept)) {
                System.out.println(p);
            }
        }

        String maxDept = "";
        int max = 0;

        for (String dept : departmentMap.keySet()) {
            int size = departmentMap.get(dept).size();

            if (size > max) {
                max = size;
                maxDept = dept;
            }
        }

        System.out.println("\nKhoa " + maxDept + " đang đông nhất (" + max + " bệnh nhân)");
    }
}