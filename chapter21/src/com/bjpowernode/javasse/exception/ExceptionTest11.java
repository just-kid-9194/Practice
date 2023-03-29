package com.bjpowernode.javasse.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
* finally语句
*   放在finally语句块中的代码是一定会执行的【再次强调!!】
* */
public class ExceptionTest11 {
    public static void main(String[] args) {
        //try和finally，没有catch语句可以吗？ 可以
        //try不能单独使用，可以喝finally联合使用
        /*
        * 以下代码的执行顺序:
        *   先执行try..
        *   再执行finally..
        *   最后执行return(return语句只要执行方法必然结束。)
        * */
        try{
            System.out.println("try..");
            return;
        } finally {
            System.out.println("finally..");
        }
        //Unreachable statement 无法执行到的语句
        //System.out.println("az");
    }
}
