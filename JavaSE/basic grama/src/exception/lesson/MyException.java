package exception.lesson;

public class MyException extends Exception {
    //定义，当传递数字大于10时，抛出异常
    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    //toString方法，返回异常信息

    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
