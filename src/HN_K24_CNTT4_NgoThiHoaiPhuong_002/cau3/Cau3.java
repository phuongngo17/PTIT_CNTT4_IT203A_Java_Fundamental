package HN_K24_CNTT4_NgoThiHoaiPhuong_002.cau3;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println("Phần tử giao nhau: ");
        for (int i = 0; i < n; i++) {
            boolean foundInB = false;
            boolean alreadyPrinted = false;
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    foundInB = true;
                    break;
                }
            }
            for(int k = 0; k < i ; k++){
                if(A[i] == A[k]){
                    alreadyPrinted = true;
                    break;
                }
            }
            if(foundInB && !alreadyPrinted){
                System.out.print(A[i] + " ");
            }
        }
        sc.close();
    }
}
