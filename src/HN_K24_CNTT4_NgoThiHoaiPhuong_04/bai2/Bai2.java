package HN_K24_CNTT4_NgoThiHoaiPhuong_04.bai2;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Lỗi: Số lượng phần tử không hợp lệ");
            return;
        }

        Map<Integer,Integer>  map = new HashMap<>();
        System.out.println("Nhập các số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử " + (i+1) + ": ");
            int num = sc.nextInt();

            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());


        for(int i = 0; i < keys.size() - 1; i++){
            for(int j = 0; j < keys.size() - i - 1; j++){
                if(keys.get(j) > keys.get(j+1)){
                    int temp = keys.get(j);
                    keys.set(j, keys.get(j+1));
                    keys.set(j+1, temp);
                }
            }
        }

        System.out.println("Số lần xuất hiện: ");
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " xuất hiện: " + map.get(keys.get(i)));
        }

        System.out.println("Số xuất hiện nhiều nhất: ");
        for(int key : keys){
            if(map.get(key) == Collections.max(map.values())){
                System.out.println(key + "( "+map.get(key)+" lần )");
            }
        }
        sc.close();

    }
}
