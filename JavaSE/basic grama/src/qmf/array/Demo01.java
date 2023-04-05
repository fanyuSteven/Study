package qmf.array;

public class Demo01 {
    public static void main(String[] args) {
        int[] arrays = new int[4];
        arrays[0] = 1;
        arrays[1] = 1;
        arrays[2] = 1;
        arrays[3] = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(arrays[i]);
        }
        for (int array : arrays) {

        }
        int[][] a = new int[2][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);

            }

        }
    }
}
