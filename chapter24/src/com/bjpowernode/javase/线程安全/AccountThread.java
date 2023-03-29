package com.bjpowernode.javase.线程安全;

public class AccountThread extends Thread{
    private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(10000);
        System.out.println(Thread.currentThread().getName() + "\t" +act.getBalance());
    }
}
