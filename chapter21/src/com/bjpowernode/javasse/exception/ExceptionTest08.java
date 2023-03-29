package com.bjpowernode.javasse.exception;
/*
* 异常对象有两个非常重要的方法:
*   获取异常简单的描述信息:
*       String msg = exception. getMessage();
*   打印异常追踪的堆栈信息:
*       exception.printStackTrace();
* */
public class ExceptionTest08 {
    public static void main(String[] args) {
        //这里只是为了测试getMessage()方法和printStackTrace()方法。
        //这里只是new了异常对象，但是没有将异常对象抛出。JVN会认为这是一个普通的java对象。
        NullPointerException e = new NullPointerException("空指针异常！！！");

        //获取异常简单描述信息:这个信息实际上就是构造方法上面string参数。
        System.out.println(e.getMessage());
        System.out.println(e);

        //打印堆栈异常信息
        e.printStackTrace();
        System.out.println("hello world");
    }
}
