package 匿名内部类;
/*
* 匿名内都类:
* 1、什么是内部类?
*   内都类:在类的内部又定义了一个新的类。被称为内部类。
*
* 2、内部类的分类:
*       静态内部类:类似于静态变量
*       实例内部类:类似于实例变量
*       局部内部类:类似于局部变量
*
* 3、使用内部类编写的代码，可读性很差。能不用尽量不用。
*
* 4、匿名内部类是局部内部类的一种。
*   因为这个类没有名字而得名,叫做匿名内部类。
* */
public class Test01 {

    //1.成员变量 ；
    private int num=1;
    //2.成员方法；
    public void showIn() {
        Inner01 in=new Inner01();
        in.numNei=3;		// 访问内部类成员变量，需要通过内部类的对象来访问；
    }
    //3.成员内部类/实例内部类;  相当于在类的内部，对某个类做了定义；
    class Inner01{
        int numNei=2;
        public void testIn() {
            System.out.println(num); //在内部类里面，可以直接访问外部类的变量，私有也可以.
        }
    }


//    静态内部类
    static class Inner1{}

    public void doSome(){
//        局部内部类
        class Inner3{}
    }
    public static void main(String[] args) {
        new Test01().new Inner01().testIn();//
    }
}
