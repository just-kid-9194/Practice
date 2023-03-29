package com.bjpowernode.javase.reflect;

import com.bjpowernode.javase.bean.User;

public class ReflectTest02 {
    public static void main(String[] args) {
        //这是不使用反射机制，创建对象
        User user = new User();
        System.out.println(user);

//        通过反射机制，获取Class，通过Class实例化对象
        try {
            Class c = Class.forName("com.bjpowernode.javase.bean.User");
            Object o = c.newInstance();
            System.out.println(o);// com.bjpowernode.javase.bean.User@1b6d3586
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
