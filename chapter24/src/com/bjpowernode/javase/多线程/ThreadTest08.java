package com.bjpowernode.javase.多线程;
/*
* 怎么合理的终止一个线程的执行，这个方法是很常用的
* */
public class ThreadTest08 {
    public static void main(String[] args) {
        MyRunnable5 my = new MyRunnable5();
        Thread t = new Thread(my,"t");

        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        终止线程
//        你想要什么时候终止t的执行，那么你把标记修改为false，就结束了。
        my.run = false;
    }
}

class MyRunnable5 implements Runnable{
//    打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(run){
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                // return就结束了，你在结束之前还有什么没保存的。
                // 在这里可以保存呀。
                //save. . . .
                //终止当前线程
                return;
            }
        }
    }
}