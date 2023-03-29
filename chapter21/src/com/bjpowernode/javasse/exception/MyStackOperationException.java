package com.bjpowernode.javasse.exception;
/*
* 栈操作异常（自定义的）
* */
public class MyStackOperationException extends Exception {
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
