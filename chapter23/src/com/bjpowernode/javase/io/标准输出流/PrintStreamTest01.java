package com.bjpowernode.javase.io.标准输出流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
* java.io.PrintStream :标准的字节输出流。默认输出到控制台。
* */
public class PrintStreamTest01 {
    public static void main(String[] args) {
        System.out.println("hello world!");
        PrintStream ps = System.out;
        ps.println("yoyoyo");
        ps.println("wtf这也行");

//        标准输出流不需要手动close()关闭
//        之前System类使用过的方法和属性
        /*
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        system.exit(0);
        System.arraycopy(...);
        */

//        可以改变标准输出流的方向吗？可以
//        标准输出流不再指向控制台，指向"log"文件
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("log"));
//            修改输出方向，将输出方向指向“log”文件
            System.setOut(printStream);
//            再输出
            System.out.println("hello world");
            System.out.println("hello kitty");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
