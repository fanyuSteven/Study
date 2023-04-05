package qmf.oop.demo02;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "haha";
    }

    public Person(String name) {
        this.name = name;
    }
}
