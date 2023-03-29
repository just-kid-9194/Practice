package com.bjpowernode.javase.生产者与消费者;

public class Producer extends Thread{
    Warehouse wh;

    public Producer(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        while (true){
            synchronized (wh){
                if(wh.isFull){
                    try {
                        wh.notify();
                        wh.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("放入一个商品");
                wh.capacity++;
                wh.isEmpty = false;
                if(wh.capacity == 10){
                    wh.isFull = true;
                }
                System.out.println("当前仓库已有" + wh.capacity + "个商品");

                /*try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                /*if(wh.isEmpty){
                    wh.notify();
                }*/
            }
        }

    }
}
