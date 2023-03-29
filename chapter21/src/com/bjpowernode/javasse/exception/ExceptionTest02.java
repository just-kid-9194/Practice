package com.bjpowernode.javasse.exception;
/*
* 异常在Java中以什么形式存在？
*   1.异常在Java中以类的形式存在，每一个异常类都可以创建异常对象。
*
*   2.编译时异常和运行时异常，都是发生在运行阶段。编译阶段异常是不会发生的。
*       编译时异常因为什么而得名?
*     因为编译时异常必须在编译(编写)阶段预先处理，如果不处理编译器报错，因此得名。
*     所有异常都是在运行阶段友生的。因为只有程序运行阶段才可以new对象。因为异常的发生就是new异常对象。
*
*   3.编译时异常和运行时异常的区别?
*       编译时异常一般发生的概率比较高。
*           举个例子:
*               你看到外面下雨了，倾盆大雨的。
*               你出门之前会预料到:如果不打伞，我可能会生病（生病是一种异常)。
*               而且这个异常发生的概率很高，所以我们出门之前要拿一把伞。
*               "拿一把伞"就是对"生病异常"发生之前的一种处理方式。
*               对于一些发生概率较高的异常，需要在运行之前对其进行预处理。
*       运行时异常一般发生的概率比较低。
*           举个例子:
*               小明走在大街上，可能会被天上的飞机轮子砸到。
*               被飞机轮子砸到也算一种异常。
*               但是这种异常发生概率较低。
*               在出门之前你没必要提前对这种发生概率较低的异常进行预处理。
*               如果你预处理这种异常,你将活的很累。
*
*   4.编译时异常还有其他名字:
*       受检异常 CheckedException
*       受控异常
*
*   5.运行时异常还有其它名字:
*       未受检异常 UnCheckedException
*       非受控异常
*
*   6.再次强调：所有异常都是发生在运行阶段的（详见第二条）
*
*   7.Java语言中对异常的处理包括两种方式:
*       第一种方式:在方法声明的位置上,使用throws关键字,抛给上一级。
*       第二种方式:使用try..catch语句进行异常的痛捉。
*
*       举个例子:
*           我是某集团的一个销售员，因为我的失误，导致公司损失了1000元,
*           "损失1000元"这可以看做是一个异常发生了。我有两种处理方式：
*           第一种方式:我把这件事告诉我的领导【异常上抛】
*           第二种方式:我自己掏腰包把这个钱补上。【异常的捕捉】
* */
public class ExceptionTest02 {
    public static void main(String[] args) {
//        通过"异常类"实例化"异常对象"
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
        System.out.println(nfe);// java.lang.NumberFormatException: 数字格式化异常！
    }
}
