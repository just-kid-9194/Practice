package com.bjpowernode.javase.线程安全;

public class DeadLock {
    public static void main(String[] args) {
        Demo d = new Demo();

        MyThread t1 = new MyThread(d);
        t1.setName("t1");
        MyThread t2 = new MyThread(d);
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    Demo demo;

    public MyThread(Demo demo) {
        this.demo = demo;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        demo.didi();
    }
}

class Demo{
    Object obj1 = new Object();
    Object obj2 = new Object();

    public void didi() {
        if("t1".equals(Thread.currentThread().getName())){
            synchronized (obj1){
                System.out.println(Thread.currentThread().getName() + "请求保持");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getName() + "完成请求");
                }
            }
        }

        if("t2".equals(Thread.currentThread().getName())){
            synchronized (obj2){
                System.out.println(Thread.currentThread().getName() + "请求保持");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println(Thread.currentThread().getName() + "完成请求");
                }
            }
        }
    }
}
