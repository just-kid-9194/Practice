package com.bjpowernode.javase.生产者与消费者;
/*
* o.wait()方法会让正在o对象上活动的当前线程进入等待状态，并且释放之前占有的o对象的锁。
* o.notify()方法只会通知，不会释放之前占有的o对象的锁。
* */
public class Test01 {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        Producer p1 = new Producer(wh);
        Consumer c1 = new Consumer(wh);

        c1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p1.start();
    }
}
