package qmf.oop.demo11;

public class Outer {
    public static void main(String[] args) {
        new Apple().eat();
        new UserService(){

            @Override
            public void hello() {
                System.out.println("haha");
            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("Apple");
    }
}
interface UserService{
    void hello();
}