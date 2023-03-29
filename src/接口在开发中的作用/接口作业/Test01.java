package 接口在开发中的作用.接口作业;
/*
* 开放型题目:
* 设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法
* 设计一个可插拔的接口: InsertDrawable，该接口有什么方法自行定义。
* 设计一个鼠标类，实现InsertDrawable接口，并实现方法。
* 设计一个键盘类，实现InsertDrawable接口，并实现方法。设计一个显示器类，实现InsertDrawable接口，并实现方法。
* 设计一个打印机类，实现InsertDrawable接口，并实现方法。
* 在"笔记本电脑类中有一个InsertDrawable接口属性，可以让笔记本电脑可插拔鼠标、键盘、显示器、打印机等。
* 编写测试程序，创建多个对象,演示接口的作用。
* */
public class Test01 {
    public static void main(String[] args) {
//        创建外设对象
        InsertDrawAble inser1 = new Display();
        InsertDrawAble inser2 = new Keyboard();
        InsertDrawAble inser3 = new Mouse();
        InsertDrawAble inser4 = new Printer();
//        创建电脑对象
        Laptop laptop = new Laptop();
        laptop.setInsertDrawAble(inser1);
        laptop.setInsertDrawAble(inser2);
        laptop.setInsertDrawAble(inser3);
        laptop.setInsertDrawAble(inser4);

        laptop.access(laptop.getInsertDrawAble());


    }
}
