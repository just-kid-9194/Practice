package random;

import java.util.Arrays;
import java.util.Random;
/*
* 编写程序，生威5个不重复的随机数[0-100]。重复的话重新生成。
* 最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
* */
public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nums = new int[5];
        // 使数组默认值为-1
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }

        //赋值并判断
        for (int i = 0; i < nums.length; i++) {
            //生成随机数
            int num = random.nextInt(5);
            //判断随机数是否与数组中已有随机数重复，
            // 无则录入
            // 有则i-1，重复此次循环
            if(!contains(nums,num)){
                nums[nums.length-1-i] = num;
            }else{
                i--;
            }
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     *判断数组中是否包含某元素
     * @param nums 数组
     * @param num 元素
     * @return true表示包含，false表示不包含
     */
    public static boolean contains(int[] nums, int num){
        Arrays.sort(nums);
        return Arrays.binarySearch(nums,num) >= 0;
    }

}
