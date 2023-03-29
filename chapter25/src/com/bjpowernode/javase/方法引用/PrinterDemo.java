package com.bjpowernode.javase.方法引用;

import java.util.stream.Collector;

/*
*引用对象的实例方法，其实就引用类中的成员方法
* 格式：对象::成员方法
* 范例： "HelloWorld"::toUpperCase
* String类中的方法：public String toUpperCase() 将此String所有字符转换为大写
* */
class PrintString{
    //把字符串参数变成大写的数据，然后再控制台输出
    public void printUpper(String s){
        String result = s.toUpperCase();
        System.out.println(result);
    }
}

interface Printer{
    void printUpperCase(String s);
}

public class PrinterDemo{
    public static void main(String[] args) {
        //在主方法中调用usePrinter方法
//        usePrinter((String s) ->{
//            //String result = s.toUpperCase();
//            //System.out.println(result);
//
//            //System.out.println(s.toUpperCase());
//        });

        //Lambda
        usePrinter(s -> System.out.println(s.toUpperCase()));
        //引用对象的实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        //Lambda表达式被对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数
        //Lambda表达式里面的形式参数s需要全部传递给printUpper方法作为参数

    }
    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");
    }
}