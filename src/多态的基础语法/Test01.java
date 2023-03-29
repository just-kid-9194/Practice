package 多态的基础语法;
/*
    多态的基础语法：
        1.学习多态基础语法之前，普及两个概念
            第一个：向上转型
                子-->父 （自动类型转换）  （父类 引用 = new 子类()）
            第二个：向下转型
                父-->子 （强制类型转换，需要加 强制类型转换符）  （子类 引用 = (子类)父类引用）

                自动类型转换和强制类型转换是使用在基本数据类型方面的，这里是为了方便理解
                在引用类型转换这里只有向上转型和向下转型。

            注意：java中允许向上转型，也允许向下转型

      *****（重点）无论是向上转型还是向下转型，
                  两种类型之间必须要有继承关系，没有继承关系编译器报错
        2.多态指的是：
            父类型引用指向子类型对象。
            包括编译阶段和云运行阶段。
            编译阶段：静态绑定父类方法。
            运行阶段：动态绑定子类型对象方法。

        3.什么时候必须使用向下转型？
            不要随便使用强制类型转换。
            当你需要访问的是子类对象中“特有”的方法，此时必须进行向下转型
 */

public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();

        Bird b1 = new Bird();
        b1.move();
        Bird.hei();

//        父类型的引用允许指向子类型的对象，被称为向上转型
        Animal a2 = new Cat();
        a2.move();
        /*
            什么是多态？
                多种形态，多种状态
            分析：a2.move();
                java程序分为编译阶段和运行阶段。
                在编译阶段：
                    对于编译器来说，编译器只知道a2的类型是Animal，
                    所以编译器在检查语法时，会去Animal.class
                    字节码文件中找move()方法，找到后绑定上move()方法，
                    编译通过，动态绑定成功。（编译阶段属于静态绑定）
                在运行阶段：
                    运行阶段时，实际上在堆内存中创建的对象是Cat对象，
                    所以move的时候，真正参与move的对象是Cat，所以
                    运行阶段会动态执行Cat对象的move()方法。这个过程属于
                    运行阶段绑定。（运行阶段绑定属于动态绑定）

                多态表示多种形态：
                    编译时一种形态，
                    运行时另一种形态。
         */
        Animal a3 = new Cat();

        Cat x = (Cat) a3;
        x.catchMouse();

        Animal a4 = new Animal();

//        Cat y = (Cat) a4;
//        y.catchMouse();
//        y.move();         //会出现类型转换异常（java.lang.ClassCastException），因为a4实际上是一个动物对象，并不是猫对象
//        如何避免ClassCastException的发生？
        /*
            新的内容，运算符：
                instanceof
            第一：instanceof可以在运行阶段动态判断引用指向的对象的类型。
            第二：instanceof的语法：
                （引用 instanceof 类型）
            第三：instanceof运算符的运算结果只能是：TRUE/FALSE
            第四：c是一个引用，c变量保存了内存地址指向了堆中的对象。
                假设(c instanceof Cat)为true表示：
                假设(c instanceof Cat)为false表示：

        */

        if(a4 instanceof Cat){
            Cat y = (Cat) a4;
            y.catchMouse();
        }else{
            System.out.println(a4+"不是猫");
        }


    }
}
