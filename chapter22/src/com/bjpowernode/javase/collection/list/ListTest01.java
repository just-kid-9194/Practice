package com.bjpowernode.javase.collection.list;

import java.util.*;

/*
* 测试List接口中常用方法
*   1、List集合存储元秦特点:有序可重复
*       有序: List集合中的元素有下标。从e开始，以1递增。
*       可重复:存储一个1，还可以再存储1
*
*   2、List既然是collection接口的子接口，那么肯定List接口有自己“特色”的方法:
*       以下只列出List接口特有的常用的方法:
*           void add(int index, E element);     在集合的指定位置（index）上添加元素(element)
*           E get(int index);                   根据下标获取元素
*           int indexOf(Object o);              获取指定对象第一次出现处的索引
*           int lastIndexOf(Object o);          获取指定对象最后一次出现处的索引
*           E remove(int index);                删除指定下标位置的元素
*           E set(int index, E element);        修改指定位置的元素
*
*   以上几个方法不需要死记硬背，可以自己编写代码测试一下，理解一下，
*   以后开发的时候，还是要翻阅帮助文档。-
* */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        //List myList = new Vector();
        //List myList = new LinkedList();
        List myList = new ArrayList();

//        添加元素
        myList.add("A");//默认都是向集合末尾添加元素。
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("C");
//        在列表的指定位置插入指定元素（第一个参数是下标)
//        这个方法使用不多，因为对子ArrayList集合来说效率比较低。(因为底层逻辑是数组，在中间插入元素效率太低)
        myList.add(1,"Hollow");

//        迭代
        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        根据下标获取元素
        Object firstObject = myList.get(0);//A
        System.out.println(firstObject);

//        因为有下标，所以List集合有自己比较特殊的逼历方式
//        通过下标遍历
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

//        获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("C"));// 3

//        获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));// 5

//        删除指定下标位置的元素
//        删除下标为e的元素
        myList.remove(3);
        System.out.println(myList.size());// 5

//        修改指定位置的元素
        myList.set(2,"soft");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }//A Hollow soft D C
    }
}
