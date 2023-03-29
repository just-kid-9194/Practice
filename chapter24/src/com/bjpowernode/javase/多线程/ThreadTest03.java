package com.bjpowernode.javase.多线程;
/*
创建线程的第三种方式：匿名内部类
*/
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t1线程--->" + i);
                }
            }
        });

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("t2线程--->" + i);
            }
        });

        thread.start();
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}
