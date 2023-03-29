package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 关于集合元素的remove
* */
public class CollectionTest06 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
        //注意:此时获取的迭代器，指向的是那是集合中没有元素状态下的迭代器。
        // 一定要注意:集合结构只要发生改变，迭代器必须重新获取。
        //当集合结构发生了改变，却没有重新获取迭代器，调用next()方法时，会发生java.util.ConcurrentModificationException
        //Iterator it = c.iterator();

        c.add(1);
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();
//        遍历/迭代
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
