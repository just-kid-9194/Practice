package com.bjpowernode.javase.多线程;
/*
* 合并线程
*   注意！
*   在内存上线程并不是合并，只是线程之间发生了等待关系。并没有线程消失！
* */
public class ThreadTest11 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t = new Thread(new MyRunnable7(),"t");
        t.start();

//        合并线程
        try {
            t.join();   //t线程合并到当前线程中，当前线程受阻塞,t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main over");
    }
}

class MyRunnable7 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}
