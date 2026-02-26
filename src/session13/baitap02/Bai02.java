package session13.baitap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai02 {
    public static List<String> medicine(List<String> listOfMedicine) {
        List<String> duplicateList = new ArrayList<>();

        for (String thuoc : listOfMedicine) {
            if (!duplicateList.contains(thuoc)) {
                duplicateList.add(thuoc);
            }
        }

        Collections.sort(duplicateList);

        return duplicateList;
    }

    public static void main(String[] args) {
        List<String> listOfMedicine = new ArrayList<>();
        listOfMedicine.add("Paracetamol");
        listOfMedicine.add("Ibuprofen");
        listOfMedicine.add("Panadol");
        listOfMedicine.add("Paracetamol");
        listOfMedicine.add("Aspirin");
        listOfMedicine.add("Ibuprofen");

        List<String> result = medicine(listOfMedicine);

        System.out.println("Danh sách sau xử lý: " + result);
    }
}


