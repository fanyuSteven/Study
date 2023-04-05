package qmf.operator;

public class Demo06 {
    public static void main(String[] args) {
        //扩展赋值运算符
        int a=10;
        int b=20;
        a+=b;//a=a+b
        a-=b;//a=a-b
        System.out.println(a);

        //字符串连接符    +   ,String
        System.out.println("a+b="+(a+b));//输出的是a+b=30
        //特别的
        System.out.println("a+b="+a+b);//输出的是a+b=1020，a、b未进行运算
        System.out.println(a+b+"a+b=");//30a+b=，a、b做了运算

        //条件运算符 ? :
        //x ? y : z;
        //如果x==true,结果为y，否则结果为z
    }
}
