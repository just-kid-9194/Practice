package com.bjpowernode.javase.多线程;
/*
* 关于线程优先级
*   优先级较高的，只是抢到的cpu时间片相对多一些
* */
public class ThreadTest09 {
    public static void main(String[] args) {
        System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);

//        Thread-0默认优先级是:5
        Thread t = new Thread(()-> System.out.println(Thread.currentThread().getName() +
                "默认优先级是:" +
                Thread.currentThread().getPriority()));
        t.start();
//        main线程的默认优先级为5
        System.out.println(Thread.currentThread().getName() +
                "默认优先级是:" +
                Thread.currentThread().getPriority());
    }
}
