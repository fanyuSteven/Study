package qmf.struct;

public class Demo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + '\t');//这里字符用“ ”表字符串，用‘’会格式转换变成int型，i+‘*’会变成int型
            }
            System.out.println();
        }
    }
}
