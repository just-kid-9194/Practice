package com.bjpowernode.javase.reflect;
/*
* 1.反射机制有什么用?
*   通过java语言中的反射机制可以操作字节码文件。有点类似于黑客。”(可以读和修改字节码文件。)
*   通过反射机制可以操作代码片段。(class文件。)
*
* 2.反射机制的相关类在哪个包下?
*   java. lang.reflect.* ;
*
* 3、反射机制相关的重要的类有哪些?
*   java.lang.Class: 代表整个字节码，代表一个类型
*   java.lang.reflect.Method：代表字节码中的方法字节码
*   java.lang.reflect.Constructor：代表字节码中的构造方法字节码
*   java.lang.reflect.Field：代表字节码中的属性字节码
*
* */

//    Class
public class Overview{
//    Field
    int no;
//    Constructor
    public Overview() {
    }

    public Overview(int no) {
        this.no = no;
    }
//    Method
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
