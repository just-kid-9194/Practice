package com.bjpowernode.javase.collection.vector;

import java.util.*;

/*
* Vector :
*   1、底层也是一个数组。
*
*   2、初始化容量:10
*
*   3、怎么扩容的?
*       扩容之后是原容量的2倍。10-->20 -->40 --> 80
*
*   4、ArrayList集合扩容特点:
*       ArrayList集合扩容是原容量1.5倍。
*
*   5、Vector中所有的方法都是线程同步的，都带有synchronized关键字，是线程安全的。
*     效率比较低，使用较少了。
*
*   6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢?
*       使用集合工具类:java.util.collections;
*
*           java.util.collection是集合接口。
*           java.util.Collections是集合工具类。
* */
public class VectorTest01 {
    public static void main(String[] args) {
//        创建一个vector集合对象
//        Vector vector = new Vector();
        List vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        //自动扩容（扩容后容量是20）
        vector.add(11);

        Iterator it = vector.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        这个可能以后要用
        List myList = new ArrayList();//非线程安全的
//        变成线程安全的
        Collections.synchronizedList(myList);//这里涉及到多线程，先记住
//        这里myList集合就是线程安全的了
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
