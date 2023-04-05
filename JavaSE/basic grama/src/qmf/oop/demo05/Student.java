package qmf.oop.demo05;

import java.sql.SQLOutput;

//子类，派生类
public class Student extends Person {
    public Student(){
        super();//调用student无参构造时隐藏的代码，即使没写也会调用
        System.out.println("我是子类，Student");
    }
}
