package qmf.oop.demo08;

public final class Person {
    {
        //代码块(匿名代码块)
        System.out.println("匿名代码块");
    }
    static{
        //静态代码块，类Person一加载就执行，且执行一次
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("无参构造");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("================");
        Person person2 = new Person();

        /*输出结果
        * 静态代码块
        * 匿名代码块
        * 无参构造
        * ================
        * 匿名代码块
        * 无参构造*/
    }
}

