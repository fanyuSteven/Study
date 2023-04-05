package qmf.oop.demo01;

public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "QMF";
        change(person);
        System.out.println(person.name);
    }
    public static void change (Person person){
        person.name= "Q.M.F.";
    }
}
class Person {
    String name;
}
