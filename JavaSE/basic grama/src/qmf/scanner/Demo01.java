package qmf.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()) {
            //使用next方式接受
            String str = scanner.next();
            System.out.println("输入的内容为：" + str);
        }
        //凡是属于I/O流的类如果不关闭会一直占用资源，要养成关闭的好习惯
        scanner.close();
    }
}
