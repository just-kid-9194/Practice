package com.bjpowernode.javasse.exception;

import java.util.Scanner;

public class ExceptionTest05 {
    //第一种处理方式：在方法的声明位置上继续使用throws，来完成异常的继续上抛，抛给调用者
    //上抛类似于推卸责任。（继续把异常传递给调用者。）
    /*
    public static void main(String[] args) throws ClassNotFoundException {

        doSome();
    }
    */

    //第二种处理方式：try..catch进行捕捉
    //捕捉等于把异常拦下了，异常真正的解决了。(调用者是不知道的。)
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);
        arr[0] = scan.nextInt();
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome...");

    }
}
