package com.bjpowernode.javase.多线程;
/*
怎么叫醒一个正在休眠的线程？
注意：这个不是终止线程的运行，而是终止线程的睡眠
*/
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.start();

//        希望5秒后将t线程唤醒
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制。)
        t.interrupt();//干扰，一份冷水泼过去！！
    }
}

class MyRunnable3 implements Runnable{

//    重点:run()当中的异常不能throws ，只能try catch
//    因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->begin");
        try {
//            睡眠一年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "--->end");
    }
}
