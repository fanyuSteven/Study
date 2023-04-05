package qmf.struct;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        double a;
        double b;
        String c;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        a=scanner1.nextDouble();
        c=scanner2.nextLine();
        b=scanner3.nextDouble();
        double d=select(a,c,b);
        System.out.println(d);
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }

    public static double select(double a, String x, double b) {
        switch (x) {
            case "+":
                return add(a, b);
            case "-":
                return s(a, b);
            case "*":
                return c(a, b);
            case "/":
                return chu(a, b);
            default:
                System.out.println("无法计算");
                return 0;
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double s(double a, double b) {
        return a - b;
    }

    public static double c(double a, double b) {
        return a * b;
    }

    public static double chu(double a, double b) {
        return a / b;
    }
}
