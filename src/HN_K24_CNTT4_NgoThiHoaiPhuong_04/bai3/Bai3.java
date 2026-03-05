package HN_K24_CNTT4_NgoThiHoaiPhuong_04.bai3;

import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thập phân: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Lỗi: Số không hợp lệ");
            return;
        }
        if(n == 0){
            System.out.println("Số nhị phân: 0");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while(n > 0){
            stack.push(n % 2);
            n /= 2;
        }
        System.out.println("Số nhị phân là: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        sc.close();
    }
}
