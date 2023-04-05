package qmf.basic;

public class Demo01 {
    public static void main(String[] args) {
        //基本类型
        //整数
        int num = 10;//最常用，占4字节
        byte num1 = 20;//占1字节
        short num2 = 30;//占2字节
        long num4 = 30L;//Long类型一定要再数字后加 L ，占8字节
        //浮点数，小数
        float num5 = 50.1F;//float类型要在数字后加个 F，占4字节
        double num6 = 3.1415;//占8字节
        //字符
        char name = '国';//占2字节，C语言中占1字节
        //布尔值：true or flase
        boolean flag = true;//占 1bit/1位
        //字符串，不是基本类型
        String name1 = "中国";//String不是关键字而是一个java类，就像Integer,Byte;这些首字母大写的都是一个类
        //应用数据类型（reference Type）
        /*
        类
        接口
        数组
         */
        //进制
        int h = 0b10;//二进制0b开头
        int i = 10;//十进制
        int j = 010;//八进制 0开头
        int k = 0x10;//十六进制 0x开头
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("============================");
        //==============================================
        //=================浮点数拓展=====================
        //==============================================
        float f = 0.1F;//0.1
        double d = 1.0 / 10;//0.1
        System.out.println(f == d);//判断f是否等于d
        System.out.println(f);
        System.out.println(d);
        //===============================================
        float d1 = 2312312312312312313f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);
        System.out.println(d1);
        System.out.println(d2);
        //浮点型因为是 有限 离散 有舍入误差 大约 接近但不等于
        //所以尽量不用浮点型进行比较
        //而用一个类数据工具类 BigDecimal
        System.out.println("============================");
        //==============================================
        //=================字符拓展======================
        //==============================================
        char c1 = 'a';
        char c2 = '国';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int) c1);//强制类型转换
        System.out.println((int) c2);//强制类型转换

        //  转义字符

        //\n 换行
        //\t 制表符
        //...
        System.out.println("hello\tworld\tworld\t");
        System.out.println("world\tworld\tworld\t");

        System.out.println("============================");
        //==============================================
        //=================字符串拓展=====================
        //==============================================
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1 == s2);
        String s3 = "hello world";
        String s4 = "hello world";
        System.out.println(s3 == s4);

        System.out.println("============================");
        //==============================================
        //=================字符串拓展=====================
        //==============================================
        boolean flag1 = true;
        if (flag1 == true) ;//新手
        if (flag1) ;//老手，应为boolea型可以直接判断不用比较
    }
}
