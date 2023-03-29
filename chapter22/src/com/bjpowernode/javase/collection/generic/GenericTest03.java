package com.bjpowernode.javase.collection.generic;

/*
* 自定义泛型（Custom generics）
*
* 自定义泛型的时候，<>尖括号中的是一个标识符，随便写。java源代码中经常出现的是:
*   <E>和<T>
    E是Element单词首字母。
*   T是Type单词首字母。
* */
public class GenericTest03<CustomGenerics> {        //<>中是标识符，可以随便写
    public void doSome(CustomGenerics o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
//        类型不匹配
//        gt.doSome(100);
        gt.doSome("yes,sir");

        MyClass<Integer> mc = new MyClass<>();
        System.out.println(mc.getE(100));

//        不用泛型就是Object类型
        MyClass mc2 = new MyClass();
        System.out.println(mc2.getE(new Object()));
    }
}

class MyClass<E>{
    public E getE(E e){
        return e;
    }
}
