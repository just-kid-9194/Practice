package com.bjpowernode.javase.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) {
//        通过io流读取classinfo.properties文件
        FileReader reader = null;
        Properties pro = null;
        try {
            reader = new FileReader("chapter26/classinfo.properties");
//            创建属性类对象map
            pro = new Properties();
//            加载
            pro.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                关闭流
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        通过key获取value
        String className = pro.getProperty("className");
//        通过反射机制实例化对象
        try {
            Class c = Class.forName(className);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
