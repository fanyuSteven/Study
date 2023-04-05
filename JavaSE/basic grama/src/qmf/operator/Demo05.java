package qmf.operator;

public class Demo05 {
    public static void main(String[] args) {
        //逻辑运算符 与（&&）   或（||）   非（!）
        //需要注意的是逻辑运算时会发生短路，eg：判断或时如果已经出现false后面的式子就不会进行判断运行
        //c=false d=1，c&&(++d==2),运行后d仍为1
        boolean a=true;
        boolean b=false;
        System.out.println((a&&b));
        System.out.println((a||b));
        System.out.println((!a));
    }
}
