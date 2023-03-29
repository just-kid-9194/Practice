package StringBuffer和StringBuilder;
/*
* java.lang.StringBuilder
*
* StringBuffer和StringBuilder的区别?
*   StringBuffer中的方法都有: synchronized关键字修饰。表示StringBuffer在多线程环境下运行是安全的。
*   StringBuilder中的方法都没有: synchronized关键字修饰，表示stringBuilder在多线程环境下运行是不安全的。
*
* 基本原则：
*   如果要操作少量的数据，用String ；
*   单线程操作大量数据，用StringBuilder ；
*   多线程操作大量数据，用StringBuffer。
* */
public class StringBuilderTest01 {
}
