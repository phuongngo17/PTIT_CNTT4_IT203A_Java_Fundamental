package HN_K24_CNTT4_NgoThiHoaiPhuong_04.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(n <= 0){
            System.out.println("Lỗi: Số lượng sinh viên không hợp lệ");
            return;
        }

        List<String> list = new ArrayList<>();
        System.out.println("Nhập tên sinh viên: ");
        for (int i = 0; i < n ; i++){
            System.out.println("Sinh viên " + (i+1) + ": ");
            list.add(sc.nextLine());
        }

        //tìm tên dài nhất
        String longest = list.get(0);
        for(String name : list){
            if(name.length() > longest.length()){
                longest = name;
            }
        }

        //sắp xếp theo tứ tự alphabet
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = 0; j < list.size() - i - 1; j++){
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        //đếm số sinh viên có tên bắt đầu bằng "A"
        int count = 0;
        for(String name : list){
            if(name.toLowerCase().startsWith("a")){
                count++;
            }
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Sorted list: ");
        for(String name : list){
            System.out.println(name);
        }
        System.out.println("Number of names starting with 'A': " + count);
        sc.close();
    }

}
