package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 关于java.util.collection接口中常用的方法。
*   1、Collection中能存放什么元素?
*       没有使用“泛型“之前,collection中可以存储object的所有子类型。
*       使用了“泛型”之后，collection中只能存储某个具体的类型。
*       集合后期我们会学泛型语法。目前先不用管。
*       collection中什么都能存，只要是object的子类型就行。
*       (集合中不能疸接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址。)
*
*   2.Collection中的常用方法。
*       boolean add(E e);           向集合中添加元素
*       int size();                 获取集合中元素的个数
*       boolean contains(Object o); 判断集合中是否拥有指定元素
*       boolean remove(Object o);   删除集合中某个元素
*       boolean isEmpty();          判断集合中元素的个数是否为零
*       Object[] toArray();         将集合转换为数组
*       void clear();               清空集合中的元素
*
* */
public class CollectionTest01 {
    public static void main(String[] args) {
//        创建一个集合对象
//        Collection c = new Collection();//接口是抽象的，无法实例化
//        多态
        Collection c = new ArrayList();
//        测试collection的常用方法
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(true);

//        获取集合中元素个数
        int s = c.size();
        System.out.println(s);// 4

//        判断集合中是否拥有指定元素
        boolean flag = c.contains(3.14);
        System.out.println(flag); // true
        System.out.println(c.contains(new Object())); //false

//        删除集合中某个元素
        c.remove(true);
        System.out.println(c.size()); //3

//        判断集合中元素的个数是否为零
        System.out.println(c.isEmpty());//false

//        将集合转换为数组
        Object[] objects = c.toArray();
        for(Object obj : objects){
            System.out.println(obj);
        }//1200 3.14 java.lang.Object@1b6d3586

//        移除集合中所有元素
            c.clear();
        System.out.println(c.size());// 0

        System.out.println(c.isEmpty());//true
    }
}
