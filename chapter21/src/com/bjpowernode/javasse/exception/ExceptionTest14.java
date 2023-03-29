package com.bjpowernode.javasse.exception;
/*
* final finally finalize有什么区别？
* */
public class ExceptionTest14 {
    public static void main(String[] args) {
        //final是一个关键字，修饰的变量表示最终的，不变的。只能赋值一次
        final int i = 100;

        //finally也是一个关键字，和try联合使用，使用在异常处理机制中
        //finally语句块块中的代码是一定会执行的
        try{
            System.out.println("try..");
        } finally {
            System.out.println("finally..");
        }

        //finalize()是Object类中的一个方法，作为方法名出现
        //所以finalize是一个标识符
        //finalize();
    }
}
