package qmf.struct;

public class Demo05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int k = 0; k < 7-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
