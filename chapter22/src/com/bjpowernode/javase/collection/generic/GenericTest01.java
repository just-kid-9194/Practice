package com.bjpowernode.javase.collection.generic;

import java.util.ArrayList;
import java.util.List;

/*
* 1.jdk5.0之后推出的新特性：泛型
* 2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。(运行阶段泛型没用!)
* 3、使用了泛型好处是什么?
*   第一:集合中存储的元素类型统一了。
*   第二:从集合中取出的元秦类型是泛型指定的类型，不需要进行大量的向下转型!
* 4、泛型的缺点是什么?
*   导致集合中存储的元素缺乏多样性!
*   大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可。
* */
public class GenericTest01 {
    public static void main(String[] args) {
/*//        不使用泛型，分析程序存在的缺点
//        创建集合
        List myList = new ArrayList();
//        创建对象
        Cat c = new Cat();
        Bird b = new Bird();
//        将对象加入集合
        myList.add(c);
        myList.add(b);

//        遍历集合，取出Cat让它抓老鼠，取出Bird让它飞。
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object a = it.next();
//            next方法取出的都是Object类型,想要使用Cat类和Bird类的特有方法，必须进行强转
            if( a instanceof Cat){
                Cat cat = (Cat) a;
                cat.catchMouse();
            }else if (a instanceof Bird){
                Bird bird = (Bird) a;
                bird.fly();
            }
        }*/

//        使用泛型机制
//        使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据
//        用泛型来指定集合中存储的类型
        List<Animal> myList = new ArrayList<Animal>();

//        指定List集合中只能存储Animal类型，那么存储String就会报错
//        这样用了泛型之后，集合中元素的数据类型更加统一了。
//        myList.add("abc");

//        创建对象
        Cat c = new Cat();
        Bird b = new Bird();
//        将对象加入集合
        myList.add(c);
        myList.add(b);
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }

    @Override
    public void move() {
        System.out.println("猫在走猫步！");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }

    @Override
    public void move() {
        System.out.println("鸟在蹦蹦跳跳！");
    }
}
