package com.bjpowernode.javasse.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 关于try ..catch中的finally子句:
*   1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常。
*       finally子句必须和try一起出现，不能单独编写。
*
*   2、finally语句通常使用在哪些情况下呢?
* */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\下载文件\\2022实训\\注解开发");

            String s = null;
            //这里一定会出现空指针异常
            System.out.println(s.toString());

            //流使用完需要关闭，因为流是占用资源的
            //即使以上程序出现异常，流也必须要关闭!
            // 放在这里有可能流关不了。
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  finally {
            //流的关闭故在这里比较保险。
            //finaLly中的代码是一定会执行的。
            //即使try中出现了异常!
            System.out.println("finaLly中的代码一定会执行");
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
