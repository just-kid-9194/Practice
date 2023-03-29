package com.bjpowernode.javase.collection.hashset;

import java.util.HashSet;
import java.util.Set;

/*
* HashSet集合：
*   无序不可重复。
* */
public class HashSetTest01 {
    public static void main(String[] args) {
//        演示一下HashSet集合特点
        Set<String> set = new HashSet<>();

//        添加元素
        set.add("999");
        set.add("222");
        set.add("333");
        set.add("444");
        set.add("111");
        set.add("444");
        set.add("333");
        set.add("888");

//        遍历
        /*
            111
            222
            333
            444
            888
            999
            1、存储时顺序和取出的顺序不同。
            2、不可重复。
            3、放到HashSet集合中的元素实际上是放到HashNap集合的key部分了。
            */
        for(String s : set){
            System.out.println(s);
        }
    }
}
