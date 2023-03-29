package com.bjpowernode.javase.生产者与消费者;

public class Consumer extends Thread {
    Warehouse wh;

    public Consumer(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while (true){
            synchronized (wh){
                if(wh.isEmpty){
                    try {
                        wh.notify();
                        wh.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("拿走一个商品");
                wh.capacity--;
                wh.isFull = false;
                if(wh.capacity==0){
                    wh.isEmpty = true;
                }
                System.out.println("当前仓库还有" + wh.capacity + "个商品");

                /*try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                /*if(wh.isFull){
                    wh.notify();
                }*/
            }
        }

    }
}
