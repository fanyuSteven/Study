package qmf.struct;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = scanner.nextLine();
        if (s.equals("hello")){
            System.out.println(s);
        }
        scanner.close();
    }
}
