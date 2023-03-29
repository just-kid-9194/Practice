package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 关于集合迭代/遍历专题（重点*****）
*
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意:以下讲解的遍历方式/迭代方式，是所有collection通用的一种方式。
        //在Map集合中不能用。在所有的Collection以及子类中使用。
        //创建集合对象
        Collection c = new ArrayList();//后面的集合无所谓，主要是看前面的Collection接口，怎么遍历/迭代。
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(true);
        c.add(new Object());
        //对集合对象进行遍历/迭代
//        第一步：获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //第二步:通过以上获取的迭代器对象开始迭代/遍历集合。
        //以下两个方法是迭代器对象Iterator中的方法:
        //boolean hasNext( )如果仍有元素可以迭代，则返回true
        //Object next()返回迭代的下一个元素。

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("================");

        //HashSet集合：无序不可重复
        Collection c2 = new HashSet();
        //无序:存进去和取出的顺序不一定相同。
        //不可重复:存储100，不能再存储100.
        c2.add(200);
        c2.add(10);
        c2.add(56);
        c2.add(300);
        c2.add(100);
        c2.add(400);
        c2.add(200);
        c2.add(new String("abc"));
        c2.add(new String("abc"));
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
