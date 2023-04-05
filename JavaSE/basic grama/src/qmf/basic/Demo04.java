package qmf.basic;

public class Demo04 {
    //属性 即变量，在类中的变量叫属性

    //类变量 加个static
    static int salary = 100;
    //实例变量；从属于对象,在对象中使用，不用赋初值，未赋值时输出默认值
    /*
    int 默认值是0
    double 默认值是0.0
    boolean 默认值是false
    除了基本类型其他默认值都是null
    eg:String 默认值是null

     */
    int age;
    String name;
    double d;
    boolean flag;

    //main方法 方法相当于C语言的函数，在类中的函数叫方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值，从属于方法，只能在该方法中使用
        int i;
        i = 10;
        System.out.println(i);

        //实例变量使用
        Demo04 demo04 = new Demo04();//定义一个Demo04类的对象，对象名是demo04
        System.out.println(demo04.age);//未赋初值输出默认值
        System.out.println(demo04.name);
        System.out.println(demo04.d);
        System.out.println(demo04.flag);
        //类变量使用
        System.out.println(salary);
    }

    //其他方法,add
    public void add() {

    }
}
