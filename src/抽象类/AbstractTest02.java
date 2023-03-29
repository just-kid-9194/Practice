package 抽象类;

public class AbstractTest02 {
    public static void main(String[] args) {
//        能不能使用多态？
//        可以。父类型引用指向子类型对象。
//        面向抽象编程，不面向具体编程，降低程序的耦合度，提高程序的扩展力。
//        这种编程思想符合OCP原则。
        Animal a = new Bird();  //这就是面向抽象编程
        a.move();
    }
}

abstract class Animal{
    public abstract void move();
}
/*
* 分析:Animal是父类,并且是抽象的。
*   Animal这个抽象类中有一个抽象方法nove.
*   Bird是子类,并且是非抽象的。
*   Bird继承Animal之后,会将抽象方法继承过来。
*   而抽象方法只能出现在抽象类中，出现冲突。
*   所以————————
*   （重要结论）一个非抽象类继承抽象类，必须将抽象类中所有抽象方法全部实现。(对抽象方法的覆盖可以称作实现)
*            这是java语法上强行规定的，必须实现，不然编译报错。
*
*
* */
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}
/*
* 此时Cat也是抽象类，那么在它继承Animal抽象类时不用实现抽象方法
* */
abstract class Cat extends Animal{

}
