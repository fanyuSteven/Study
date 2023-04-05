package qmf.struct;

import java.util.Scanner;

public class Demo07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = f(n);
        scanner.close();
        System.out.println(x);
    }

    public static double f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }
}
