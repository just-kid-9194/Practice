package com.bjpowernode.javasse.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
* 处理异常的第一种方式:
*   在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者来处理。
*   这种处理异常的态度:上报。
* 处理异常的第二种方式:
*   使用try ..catch语句对异常进行捕捉。这个异常不会上报，自己把这个事儿处理了。
*   异常抛到此处为止，不再上抛了。
*
* 注意:
*   只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。
*   另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
*   try..catch捕捉异常之后，后续代码可以执行
* */
public class ExceptionTest06 {
    /*public static void main(String[] args) throws FileNotFoundException {
        //一般不建议在main方法上使用throws，因为这个异常如果真正的发生了，一定会抛给JVW。JVM只有终止。
        //异常处理机制的作用就是增强程序的健壮性。怎么能做到，异常发生了也不影响程序的执行。
        // 所以一般main方法中的异常建议使用try..catch进行捕捉。main就不要继续上抛了。
        System.out.println("main begin");
        m1();
        System.out.println("main over");

    }*/

    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("hello world");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("文件不存在，可能是路径错误，请检查文件路径");
        }
        System.out.println("main over");

    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }


    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() throws FileNotFoundException {
        //调用SUN jdk中某个类的构造方法(与io流有关)
        /*
        * 编译报错的原因是什么?
        *   第一:这里调用了一个构造方法:FileInputStream(String name)
        *   第二:这个构造方法的声明位置上有:throws FileNotFoundException
        *   第三:通过类的继承结构看到:FiLeNotFoundException父类是ITOException , IOException的父类是Exception
        *   最终得知，FileNotFoundException是编译时异常。
        *
        *   错误原因:编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器就报错。
        * */
        new FileInputStream("D:\\下载文件\\2022实训\\注解开发.txt");
    }

}
