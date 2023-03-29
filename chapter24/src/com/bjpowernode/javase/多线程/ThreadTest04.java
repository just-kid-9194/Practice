package com.bjpowernode.javase.多线程;
/*
1、怎么获取当前线程对象?
    静态方法 Thread.currentThread()
2、获取线程对象的名字
    线程对象.getName()
3、修改线程对象的名字
    线程对象.setName()
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//main

        Thread t1 = new Thread(new MyRunnable2());
        Thread t2 = new Thread(new MyRunnable2());

        System.out.println(t1.getName());//Thread-0
        System.out.println(t2.getName());//Thread-1

        /*t1.setName("ttt");

        System.out.println(t1.getName());//ttt*/

        t1.start();
        t2.start();

    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        Thread curThread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(curThread.getName() + "--->" + i);
        }
    }
}

