package com.bjpowernode.javase.reflect;

import java.io.FileReader;


/*
* 关于文件路径的问题
* */
public class AboutPath {
    public static void main(String[] args) {
//        这种方式的路径缺点是:移桓性差，在IDEA中默认的当前路径是project的根。
//        这个代码假设离开了IDEA，换到了其它位置，可能当前路径就不是project的根了，这时这个路径就无效了。
//        FileReader reader = new FileReader("chapter26/classinfo.properties");

//        接下来说一种比较通用的一种路径。即使代码换位置了，这样编写仍然是通用的。
//        注意:使用以下通用方式的前提是:这个文件必须在类路径下。
//        什么是类路径下？
//          方式在src下的都是类路径下。【记住它】src是类的根路径。

        /*
         * 解释:
         *   Thread.currentThread()当前线程对象
         *   getContextClassLoader(）是线程对象的方法，可以获取到当前线程的类加载器对象。
         *   getResource()【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。
         * */
        String path = Thread.currentThread().getContextClassLoader().
                getResource("classinfo2.properties").getPath();

        System.out.println(path);// /D:/workspace/IdeaProject/Practice/out/production/chapter26/classinfo2.properties
    }
}
