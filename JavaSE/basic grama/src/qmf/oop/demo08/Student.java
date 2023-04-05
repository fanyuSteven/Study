package qmf.oop.demo08;

import qmf.oop.demo08.Person;

public class Student {
    private static int age;


    private double score;

    public static void run(){
        System.out.println("奔跑吧");
    }

    public void go(){
        System.out.println("走吧");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);//static静态变量，和类一起加载可以调用
        //System.out.println(Student.score);//score非静态变量，没有new一个实例无法调用
        System.out.println(s1.age);
        System.out.println(s1.score);
        Student.run();//static静态方法，和类一起加载可以调用
        run();//static静态方法，和类一起加载可以调用，就在类里面可以直接调用
        //Student.go();//go(）非静态方法，没有new一个实例无法调用
        //go();//go(）非静态方法，没有new一个实例无法调用
        new Student().go();
        new Student().run();
    }

}
