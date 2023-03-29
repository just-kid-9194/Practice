package com.bjpowernode.javase.增强for循环;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
//        创建List集合
        List<String> list = new ArrayList<>();

//        添加元素
        list.add("hello");
        list.add("world");
        list.add("kitty");

//        遍历，使用迭代器方式
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=============");

//       使用下标方式（只针对有下表的集合）
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============");

//        使用foreach
        for (String s:
             list) {
            System.out.println(s);
        }


    }
}
