package com.bjpowernode.javase.collection.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
* ArrayList集合的构造方法
*   public ArrayList()
*   public ArrayList(int initialCapacity)
*   public ArrayList(Collection<? extends E> c)
* */
public class ArrayListTest02 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList(20);

//        创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

//        通过这种方法，可以将hashset集合转换成List集合
        List list3 = new ArrayList(c);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

    }
}
