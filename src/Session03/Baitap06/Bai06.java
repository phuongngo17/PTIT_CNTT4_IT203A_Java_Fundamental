package Session03.Baitap06;

import java.util.Arrays;

public class Bai06 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;

        int[] temp = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            int value;

            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }

            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 2, 3, 5, 7, 7};
        int[] arraySecond = {2, 3, 4, 6, 7, 8};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách sách hoàn chỉnh của thư viện:");
        System.out.println(Arrays.toString(arrayMerge));
    }
}
