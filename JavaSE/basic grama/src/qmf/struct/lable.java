package qmf.struct;

public class lable {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i/2; j++) {
                continue outer; //break outer;
            }

        }
    }
}
