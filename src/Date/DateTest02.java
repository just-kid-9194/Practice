package Date;

import java.util.Date;

/*
* 获取自1970年1月1日00:00:00 000到当前系统时间的总毫秒数。
*
* 简单总结一下system类的相关属性和方法:
*   System. out 【out是system类的静态变量。】
*   System.out.println() 【println()方法不是System类的，是PrintStream类的方法。】
*   System.gc()建议启动垃圾回收器
*   System.currentTimeMillis(）获取自1970年1月1日到系统当前时间的总毫秒数。
*   System.exit(0)退出JVN。
* */
public class DateTest02 {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);// 1669428021085

        // 需求:统计一个方法执行所耗费的时长
        // 统计一个方法耗时
        // 在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        // 在调用目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        long consume = end - begin;
        System.out.println(consume + "ms");

    }

    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
