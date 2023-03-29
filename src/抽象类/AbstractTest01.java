package 抽象类;

/*
* 1.什么是抽象类？
*   类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
*
* 2.抽象类属于什么类型？
*   抽象类也属于引用数据类型。
*
* 3.抽象类怎么定义？
*   语法：
*       [修饰符列表] abstract class 类名{
*           类体;
*       }
*
* 4.抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
*
* 5.final和abstract不能联合使用，这两个关键字是对立的。
*
* 6.抽象类的子类可以是抽象类。
*
* 7.抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
*
* 8.抽象类关联到一个概念：抽象方法。什么是抽象方法呢？
*   抽象方法表示没有实现的方法，没有方法体的方法。例如：
*       public abstract void doSome();
*   抽象方法特点是：
*       （1）没有方法体，以分号结尾。
*       （2）修饰符列表中有abstract关键字。
*
* 9.抽象类中不一定有抽象方法，抽象方法只能在抽象类中。
*
* 10.（重要结论）一个非抽象类继承抽象类，必须将抽象类中所有抽象方法全部实现。(对抽象方法的覆盖可以称作实现)
* */

public class AbstractTest01 {
    public static void main(String[] args) {
//        抽象类与接口.Account是抽象的; 无法实例化
//        Account act = new Account();
    }
}

//  银行抽象类
abstract class Account{
    public Account(){

    }

    public abstract void doSome();
}

//  子类继承抽象类，非抽象子类可以实例化对象
class CreditAccount extends Account{
    @Override
    public void doSome() {

    }
}