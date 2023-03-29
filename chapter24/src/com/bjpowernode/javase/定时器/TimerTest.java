package com.bjpowernode.javase.定时器;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
* 使用定时器指定定时任务
* */
public class TimerTest {
    public static void main(String[] args) {
//        创建线程对象
        Timer timer = new Timer();
//        Timer timer = new Timer(true);  // 设置为守护线程

//        指定定时任务
//        timer.schedule(定时任务,第一次执行时间,间隔时间);
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = new Date();
        String s =sdf.format(date.getTime());*/
        timer.schedule(new LogTimerTask(),new Date(),1000 * 10);
    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask{
    @Override
    public void run() {
//        编写你需要执行的任务就行了
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(new Date()) + ":成功完成了一次数据备份");
    }
}


