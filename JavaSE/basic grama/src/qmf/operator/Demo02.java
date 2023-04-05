package qmf.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;
        //多个操作数中有一个为long类型，结果为long类型，若无long类型，结果都为int类型。
        System.out.println(a+b+c+d);//long类型
        System.out.println(b+c+d);//int类型
        System.out.println(c+d);//int类型
    }
}
