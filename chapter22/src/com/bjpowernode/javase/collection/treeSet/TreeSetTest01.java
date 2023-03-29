package com.bjpowernode.javase.collection.treeSet;

import java.util.Set;
import java.util.TreeSet;

/*
* TreeSet集合存储元素特点:
*   1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序!
*     称为:可排序集合。
* */
public class TreeSetTest01 {
    public static void main(String[] args) {
//        创建集合对象
        Set<String> treeS = new TreeSet<>();
//        添加对象
        treeS.add("A");
        treeS.add("B");
        treeS.add("Z");
        treeS.add("Y");
        treeS.add("Z");
        treeS.add("K");
        treeS.add("M");
//        遍历
        /*
            A
            B
            K
            M
            Y
            Z
            从小到大自动排序！
            */
        for(String s : treeS){
            System.out.println(s);
        }
    }
}
