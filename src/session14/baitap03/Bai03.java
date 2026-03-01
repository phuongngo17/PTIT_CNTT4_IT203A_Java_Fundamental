package session14.baitap03;

import java.util.HashSet;
import java.util.Set;

public class Bai03 {
    public static void main(String[] args) {
        Set<String> medicine = new HashSet<>();
        medicine.add("Aspirin");
        medicine.add("Caffeine");
        medicine.add("Paracetamol");

        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");
        allergy.add("Pollen");

        Set<String> warning = new HashSet<>(medicine);
        warning.retainAll(allergy);
        System.out.println("Cảnh báo dị ứng: " + warning);

        Set<String> safe = new HashSet<>(medicine);
        safe.removeAll(allergy);
        System.out.println("Thành phần an toàn: " + safe);
    }

}
