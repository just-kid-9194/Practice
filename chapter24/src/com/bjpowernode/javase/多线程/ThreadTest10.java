package com.bjpowernode.javase.多线程;
/*
* 让位，当前线程暂停，回到就绪状态，让给其它线程。
* 静态方法: Thread.yield();
* */
public class ThreadTest10 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6(),"t");
        t.start();

        for (int i = 0; i <= 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}

class MyRunnable6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
//            每循环一百次让位一次
            if(i%100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}