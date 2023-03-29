package com.bjpowernode.javase.collection.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*JDK8之后引入了自动推断机制，又称为钻石表达式。
*
* */
public class GenericTest02 {
    public static void main(String[] args) {
        //创建引用时声明了泛型，创建对象时就不用再声明泛型了。
        List<Animal> list = new ArrayList<>();

        Animal a = new Animal();
        Bird b = new Bird();
        Cat c = new Cat();
        list.add(a);
        list.add(b);
        list.add(c);

        Iterator<Animal> it = list.iterator();
        while (it.hasNext()){
            it.next().move();
        }
    }
}
