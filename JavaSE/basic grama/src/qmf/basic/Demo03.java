package qmf.basic;

public class Demo03 {
    public static void main(String[] args) {
        int money = 1_000_000_000;//JDK新特性，数字之间可以用_隔开，好看出有几位，数字还是原来的数字
        int years = 20;
        int total1 = money * years;
        System.out.println(total1);
        long total2 = money * years;//虽然total2是long类型，但是右边算式是int类型没有先进行类型转换，故计算时还是溢出
        System.out.println(total2);
        long total3 = money * ((long) years);//先把一个操作数转换，这样就直接是long类型了
        System.out.println(total3);
    }
}
