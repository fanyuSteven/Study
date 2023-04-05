package qmf.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {1,5,3,6,2,4};
        System.out.println(Arrays.toString(a));//以字符串形式，输出数组元素，输出为[1, 5, 3, 6, 2, 4]
        Arrays.sort(a);                        //将数组a中元素排序
        System.out.println(Arrays.toString(a));//输出为[1, 2, 3, 4, 5, 6]
    }
}
