package final概念;

/*final
    1、final是java语言中的一个关键字。
    2、final表示最终的,不可变的。
    3、final可以修饰变量以及方法，还有类等.
    4、final修饰的变量?
        final修饰的局部变量，一旦赋值就不能再修改。
    5、final修饰的方法?
        final修饰的方法无法被覆盖。
    6、final修饰的类?
        final修饰的类无法继承。
    7、final修饰的变量，如果这个变量是一个"引用"会怎样?
        final修饰的引用一旦指向某个对象，则不能再重新指向其它对象，但该引用指向的对象内部的数据是可以修改的。
    8.final修饰的实例变量必须手动初始化，不能采用系统默认值。

    B类继承A类，相当于对A类的功能进行扩展。如果你不希望别人对A类型进行扩展。
    你可以给A类加final修饰词，这样A类就无法被继承。

    static final联合修饰的变量称为"常量"。
    常量名建议全部大写，每个单词之间采用下划线衔接
*/

public class FinalTest01 {
    public static void main(String[] args) {
        final A a = new A();
//        a = new B();
        System.out.println(a.s);

        A a2 = new A(888);
        System.out.println(a2.s);
        System.out.println(A.WINGS);
    }
}

class A{
    public static final String WINGS = "脑叶";
    public final int i = 1;
    public final int s ;

    public final void doSome(){

    }
    public void doSome(int i){

    }

    public A() {
        s = 24;
    }

    public A(int s) {
        this.s = s;
    }
}

class B extends A{

}
