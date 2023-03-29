package array;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        int[] a = {4,11,5,88,24,32,8};
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
