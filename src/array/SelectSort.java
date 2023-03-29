package array;
/*
* 选择排序：
*   每一次从这堆参与比较的数据当中找出最小值,
*   拿着这个最小值和最前面的元素交换位置。|
* */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {8,9,10,7,6,1,11,5,22,4};
//         选择排序
        for (int i = 0; i < a.length-1; i++) {
            int min = i;

            for (int j = i+1; j < a.length; j++) {
                min = a[min] < a[j] ? min : j;
            }

            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
//        遍历
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}


