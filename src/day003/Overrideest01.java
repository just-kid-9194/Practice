package day003;

/*  注意区分：方法重载（overload）与方法重写（override）

    比较常见的称呼：方法重写、方法覆盖、override、overwrite

    回顾方法重载：
        什么时候考虑使用方法重载overload？
            当在一个类中，如果功能相似的话，建议将名字定义的一样，
            这样代码美观且方便编程。

        什么条件满足之后能够构成方法重载？
            1.在同一类中
            2.方法名相同
            3.参数列表不同（个数、顺序、类型）

     方法重写override：
        当子类对父类继承过来的方法进行方法重写override后，子类对象调用该方法时
        一定执行重写后的方法。

     什么条件满足之后构成方法重写？
        1.两个类必须要有继承关系
        2.重写之后的方法和父类的方法具有：
            相同的返回值类型、
            相同的方法名、
            相同的形参列表。
        3.访问权限不能更低，可以更高。
        4.重写后的方法不能比之前的方法抛出更多的异常，可以更少。

 */

public class Overrideest01 {
    public static void main(String[] args) {
        //创建对象
        Bird b = new Bird();
        //让鸟儿移动
        b.move();

        Cat c = new Cat();

        c.move();

    }
}

//父类
class Animal{
    //移动
    public void move(){
        System.out.println("动物在移动！");
    }
}

//子类
class Bird extends Animal{
    //子类继承父类之后，有一些方法 可能需要改进。
    //此时父类中继承过来的方法已经无法满足子类的业务需求。

    //此时希望输出鸟儿在飞翔
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔！");
    }
}

class Cat extends Animal{
    //此时希望输出猫在走猫步


    @Override
    public void move() {
        System.out.println("猫在走猫步！");
    }
}