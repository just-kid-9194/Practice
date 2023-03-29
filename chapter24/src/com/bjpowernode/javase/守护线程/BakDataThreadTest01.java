package com.bjpowernode.javase.守护线程;
/*
* 守护线程 在所有线程结束后自动结束
* 设置方法：
*   线程对象.setDaemon(true);
* */
public class BakDataThreadTest01 {
    public static void main(String[] args) {
        BakThread bak = new BakThread();
        bak.setName("备份线程");

//        启动线程之前，将线程设置为守护线程
        bak.setDaemon(true);
        bak.start();

//        主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
