package qmf.array;

import java.util.Arrays;

public class boubleSort {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 8, 1, 4, 10, 7};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        int b;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
    }
}
