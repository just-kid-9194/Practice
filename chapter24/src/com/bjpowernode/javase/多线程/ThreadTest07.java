package com.bjpowernode.javase.多线程;
/*
* 在java中这么强行终止一个线程？
*   线程对象.stop();
*   这种方式存在很大的缺点:容易丢失数据。因为这种方式是直接将线程杀死了，线程没有保存的数据将会丢失。不建议使用。
* */
public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable4());
        t1.setName("t1");
        t1.start();
//        主线程睡眠5秒
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        5秒后强行终止t1线程
        t1.stop();  // 已过时，不建议使用
    }
}

class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
