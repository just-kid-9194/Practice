package array;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

/*
* 1、数组工具类:自己写的。不是SUN的。
*
* 2、关于查找算法中的:二分法查找。
*   10(下标0) 11 12 13 14 15 16 17 18 19 20(下标10) arr数组。
*
*   通过二分法查找，找出18这个元素的下标:
*       (0 + 10)/ 2 -->中间元素的下标:5
*
*   拿着中间这个元素和目标要查找的元素进行对比:
*       中间元素是: arr[5] -->15
*       15<18(被查找的元素)
*       被查找的元素18在目前中间元素15的右边。
*
* 3、二分法查找算法是基于排序的基础之上。
* */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};//length = 11

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入想查找的元素：");
        int ele = scan.nextInt();
        int temp = binsearch(arr,ele);

        if(temp == -1){
            System.out.println("该元素不存在");
        }else{
            System.out.println("元素“" + ele + "”下标为:" + temp);
        }

        /*int a =  Arrays.binarySearch(arr,20);
        System.out.println(a);*/
    }

    /**
     * 从数组中查找目标元素的下标
     * @param arr   被查找的数组(必须已排序)
     * @param dest  目标元素
     * @return  -1表示数组中无目标元素，其他表示目标元素的下标
     */
    public static int binsearch(int[] arr,int dest){
        int begin = 0;
        int end = arr.length-1;

        while(begin <= end){
            int mid = (begin + end)/2;

            if(dest < arr[mid]){
                end = --mid;
            }else if(dest > arr[mid]){
                begin = ++mid;
            }else if(dest == arr[mid]){
                return mid;
            }
        }

        return -1;
    }
}
