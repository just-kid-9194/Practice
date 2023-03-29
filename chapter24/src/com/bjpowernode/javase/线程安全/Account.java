package com.bjpowernode.javase.线程安全;
/*
* 银行账户
* */
public class Account {
//    账号
    private String actNo;
//    余额
    private double balance;

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public Account() {
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    取款的方法
//    在实例方法上可以使用synchronized吗?可以的。
//    synchronized出现在实例方法上，一定锁的是this。没得挑。只能是this。不能是其他的对象了。
//    所以这种方式不灵活。
//    另外还有一个缺点: synchronized出现在实例方法上，表示整个方法体都需要同步，可能会无故扩
//    大同步的范围，导致程序的执行效率降低。所以这种方式不常用。
    public void withdraw(double money){
//        获取原余额
/*        double before = getBalance();
//        计算现余额
        double after = before - money;

//        在这里模拟一下网络延迟，一定会出问题
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        更新余额
//        思考:t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。
        setBalance(after);*/
        /*
        * 线程同步机制的语法是:
        *   synchronized(){
        *       //线程同步代码块。
        *   }
        *
        * synchronized后面小括号中传的这个“数据"是相当关键的。
        * 这个数据必须是多线程共享的数据。才能达到多线程排队。
        *
        * ()中写什么?
        *   那要看你想让哪些线程同步。
        *       假设t1、t2、t3、t4、t5，有5个线程，
        *       你只希望t1 t2 t3排队,t4 t5不需要排队。怎么办?
        *       你一定要在()中写一个t1 t2 t3共享的对象。
        *       而这个对象对于t4 t5来说不是共享的。
        *
        * 在java语言中，任何一个对象都有―把锁”，其实这把锁就是标记。(只是把它叫做锁。)
        * 100个对象，100把锁。1个对象1把锁。
        *
        * 以下代码的执行原理?
        *   1、假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后。
        *   2、假设t1先执行了，遇到了synchronized，这个时候自动找“后面共享对象”的对象锁，
        *      找到之后，并占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是占
        *      有这把锁的。查到同步代码块代码结束，这把锁才会释放。
        *   3、假设t1已经占有这把锁，此时t2也遇到synchronized关键字，也会去占有后面共享对象
        *      的这把锁，结果这把锁被t1占有，t2只能在同步代码块外面等待t1的结束，直到t1把同步
        *      代码块执行结束了,t1会归还这把锁，此时t2终于等到这把锁，然后t2占有这把锁之后，进
        *      入同步代码块执行程序。
        *
        * 这样就达到了线程同步。
        * 这里需要注意的是:这个共享对象一定要选好了。
        * 这个共享对象一定是你需要同步的这些线程对象所共享的。
        * */
        synchronized (this){
            double before = getBalance();
            double after = before - money;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(after);
        }
    }
}
