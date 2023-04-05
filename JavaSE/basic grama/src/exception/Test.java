package exception;

import com.sun.applet2.preloader.event.ErrorEvent;

import java.security.cert.TrustAnchor;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            new Test().test(a, b);
        } catch (ArithmeticException e) {
            System.out.println("haha");
            e.printStackTrace();
        }
    }
    //假设方法处理不了异常。在方法上抛出异常
    public void test(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a / b);
    }
}

