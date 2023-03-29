package com.bjpowernode.javasse.exception;

public class ExceptionTest5 {
    public static void main(String[] args) {
        MyException me = new MyException("用户名不能为空！");
        try {
            throw me;
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println(me.getCause());// null
        me.printStackTrace();
    }
}
