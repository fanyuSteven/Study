package qmf.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        float sum = 0;
        float avg = 0;
        int count = 1;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入数据：");
        while (true) {
            System.out.print("第" + count + "数据为：");
            if (scanner.hasNextDouble())
            {
                double x = scanner.nextDouble();
                sum += x;
                count++;
            }else{
                break;
            }
        }
        scanner.close();
        System.out.println((sum / (--count)));

    }
}
