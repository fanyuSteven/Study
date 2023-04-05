package qmf.operator;

public class Demo04 {
    public static void main(String[] args) {
        //位运算符
        //&(按位与),  |(按位或),    ^(按位异或),    ~(取反),    >>(右移,除2),    <<(左移,乘2)
        /*
        A = 0011 1100
        B = 0000 1101
        -----------------------
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~A = 1100 0011
        ------------------------
        C=2
        C<<3
        C>>3
         */
        int c = 128;
        System.out.println((c >> 3));
        System.out.println((c << 3));
    }
}
