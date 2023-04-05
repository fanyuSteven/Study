package qmf.oop.demo09;

public class A extends Action{
    //抽象类的所有方法，继承他的子类，都必须要实现他声明的抽象方法，除非子类也是抽象类
    //抽象类也只能单继承，接口才能多继承
    @Override
    public void go() {
        System.out.println("走吧");
    }

}
