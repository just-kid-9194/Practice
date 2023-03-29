package array;
/*
* 冒泡排序算法
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {8,9,10,7,6,0,11,5,22,4};
//        int[] a = {0,0,0,1,1,0,0};
//        冒泡排序，从小到大排序
        for (int i = a.length-1; i > 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if(a[j] > a[j+1]){
                    int x = a[j];
                    a[j] = a[j+1];
                    a[j+1] = x;
                    flag = true;
                }
            }
            if(!flag) break;
        }
//        遍历
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
