package 接口;

/*
* 接口：
*   1.接口也是一种引用数据类型。
*
*   2.接口是完全抽象的。（抽象类是半抽象）或者也可以说接口是特殊的抽象类。
*
*   3.接口怎么定义，语法是什么？
*       [修饰符列表] interface 接口名{}
*
*   4.接口支持多继承，一个接口可以继承多个接口
*
*   5.接口中只包含两部分内容，
*    一部分是：常量，另一部分是：抽象方法。
*   接口中没有其他内容了。
*
*   6.接口中所有的元素都是public修饰的。（都是公开的）
*
*   7.接口中的抽象方法定义时: public abstract修饰符可以省略。
* */

public class Teat01 {
    public static void main(String[] args) {
    }
}

interface A{
    int sum(int a,int b);
}

interface B extends A{

}

interface C extends A,B{

}

abstract class EE implements A{

    public abstract int sum(int a, int b);
}


/*class D extends A{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}*/

