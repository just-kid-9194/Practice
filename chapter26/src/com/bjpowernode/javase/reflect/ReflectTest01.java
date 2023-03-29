package com.bjpowernode.javase.reflect;

import java.util.Date;

/*
* 要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.Lang.Class实例?
*   三种方式
*       第一种: class c = class.forName("完整类名带包名");
*       第二种: class c = 对象.getClass();
*       第三种：class c = 类.class;
* */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        *Class.forName()
        *   1.静态方法
        *   2.方法的参数是一个字符串
        *   3.字符串需要的是一个完整字符
        *   4.完整类名必须带有包名，java.lang包也不能省略
        * */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");// c1代表String.class文件，或者说代表String类型
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法: getClass()
        String s = "123";
        Class x = s.getClass();
        System.out.println(x == c1);//  true    x代表String.class字节码文件,x代表String类型。
        System.out.println(Date.class == c2);// true    c2和y两个变量中保存的内存地址都是一样的，都指向方法区中的字节码文件

        //第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.clLass属性。
        Class z = String.class;
        System.out.println(z == c1);//  true
    }
}
