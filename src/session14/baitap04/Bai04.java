package session14.baitap04;

import java.util.*;

public class Bai04 {
    public static void main(String[] args) {
        List<String> listDsease = Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String, Integer> statistics = new HashMap<>();

        for(String s: listDsease){
            statistics.put(s, statistics.getOrDefault(s, 0) + 1);
        }

        System.out.println("Báo cáo ca bệnh(sắp xếp theo tên): ");
        for(Map.Entry<String, Integer> entry: statistics.entrySet()){
            System.out.printf(" %s: %d ca%n ",entry.getKey(),entry.getValue());
        }

    }
}
