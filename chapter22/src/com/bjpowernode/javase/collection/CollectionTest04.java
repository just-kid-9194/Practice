package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

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
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        String s3 = new String("abc");
        c.add(s3);

        System.out.println(c.size());//3

        String x = new String("abc");
        System.out.println(c.contains(x));//true

        System.out.println(c.size());//3
        c.remove(new String("abc"));
        System.out.println(c.size()); //2 说明删除成功且只删除一个，remove方法比较的是对象内容，源码中调用了equals方法
    }
}
