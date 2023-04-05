package qmf.basic;

public class Demo02 {
    public static void main(String[] args) {
        //
        //容量低 ----------------------------------------------> 容量高
        //byte,short,char -> int -> long -> float -> double
        //long虽然容量高但表示范围低于float

        //强制类型转换 (类型)变量名, 由高转到低
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);
        //自动类型转换  由低转到高
        b=122;
        i=b;//不用强制转换加括号
        System.out.println(i);
        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转为低容量时，要强制转换
        4.转换时可能存在内存溢出，或精度问题!
         */
    }
}

