package com.bjpowernode.javase.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 深入collection集合的contains方法:
*   boolean contains(Object o)
*       判断集合中是否包含某个对象o
*       如果包含返回true ,如果不包含返回false。
*
* contains方法是用来判断集合中是否包含某个元素的方法，
* 那么它在底层是怎么判断集合中是否包含某个元素的呢?
*   调用了equals方法进行比对。
*   equals方法返回true，就表示包含这个元素。
* */
public class CollectionTest03 {
    public static void main(String[] args) {

//        创建字符创对象
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
//        输出字符串对象的唯一地址
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

        User u1 = new User("rose");
        User u2 = new User("rose");

//        创建集合对象
        Collection c = new HashSet();
        c.add(s1);
        c.add(s2);
//        User类没有重写hashcode方法时，u1、u2会作为两个不同的对象都进入集合，
//          重写hashcode方法后，u1、u2会作为同一对象，只能进入一个。
        c.add(u1);
        c.add(u2);
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
