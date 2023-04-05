package qmf.oop.demo01;

//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        change(a);
        System.out.println(a);
    }

    public static void change(int a){
        a=10;
    }
    //引用传递，java中只有对象才是引用传递，但本质是值传递，相当于C语言中传递指针
    public static void change2(int a){
        Person person = new Person();
        person.name="haha";
    }
}
