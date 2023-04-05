package qmf.oop.demo10;

public interface UserService {
    
    //接口中定义的属性都是常量，隐藏代码是public static final
    int AGE = 99;//=public static final int AGE = 99;

    //接口中所有定义其实都是抽象的 public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
