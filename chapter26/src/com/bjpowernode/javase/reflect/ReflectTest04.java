package com.bjpowernode.javase.reflect;
/*
* 研究一下: Class.forName()发生了什么?
*   记住，重点:
*       如果你只是希望一个类的静态代码块执行，其它代码―律不执行，你可以使用:
*       Class.forName("完整类名");
*       这个方法的执行会导致类加载，类加载时，静态代码块执行。
* */
public class ReflectTest04 {
    static {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
