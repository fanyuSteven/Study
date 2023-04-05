package qmf.oop.demo04;


public class Student {
    //private 私有权限，用get/set获取属性和方法；
    private String name;//姓名
    private int id;//学号
    private char sex;//性别
    int age;//年龄

    //get/set,提供一些方法来操作上面属性。
    //get 获得属性
    //set 给属性赋值
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //alt+Insert快捷键
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            System.out.println("年龄不合法");
        } else
            this.age = age;
    }
}
