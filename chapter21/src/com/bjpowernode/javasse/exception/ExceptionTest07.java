package com.bjpowernode.javasse.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 深入try..catch
*   1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
*   2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
*   3、catch写多个的时候，从上到下，必须遵守从小到大。(先子类后父类)
*
* 在以后的开发中，处理编译时异常，应该上报还是捕捉呢，怎么选?、
*   如果希望调用者来处理，选择throws上报。
* */
public class ExceptionTest07 {
    public static void main(String[] args)  {
        try {
            FileInputStream fis = new FileInputStream("D:\\下载文件\\2022实训\\注解开发");
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e){
            System.out.println("读文件报错！");
        }
    }
}
