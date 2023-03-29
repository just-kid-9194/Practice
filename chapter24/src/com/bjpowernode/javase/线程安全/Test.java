package com.bjpowernode.javase.线程安全;

public class Test {
    public static void main(String[] args) {
//        创建账户对象
        Account a1 = new Account("张三",10000);
//        创建两个线程
        Thread thread1 = new AccountThread(a1);
        Thread thread2 = new AccountThread(a1);
//        启动线程
        thread1.start();
        thread2.start();
        System.out.println(a1.getBalance());
    }
}
