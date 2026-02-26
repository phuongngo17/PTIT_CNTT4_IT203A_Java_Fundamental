package session13.baitap01;

import java.util.ArrayList;
import java.util.Iterator;

public class Bai01 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.8);
        list.add(99.9);
        list.add(36.8);

        System.out.println("Danh sách ban đầu: " + list);

        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()) {
            double value = iterator.next();
            if (value < 34.0 || value > 42.0) {
                iterator.remove();
            }
        }
        double sum = 0;
        for(double value : list) {
            sum += value;
        }
        Double average = list.isEmpty() ? 0 : sum / list.size();

        System.out.println("Danh sách sau khi lọc: " + list);
        System.out.println("Nhiệt độ trung bình: " + average);
    }
}
