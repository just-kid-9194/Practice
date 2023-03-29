package string;

import java.nio.charset.StandardCharsets;

/*
* 关于Java JDK中内置的一个类:java.Lang. String
*   1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。
*   2、在java中随便使用双引号括起来的都是string对象。例如: "abc" , "def", "hello world! ”，这是3个String对象。
*   3、java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到最终死亡，不可变，不能变成"abcd",也不能变成"ab"
*   4、在jdk当中用双引号括起来的字符串，例如“abc”、“def”都是直接存储在方法区的字符串常量池当中的。（jdk7.0及之后的版本字符
*       串常量池被移到堆存储当中了）
* */
public class StringTest01 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("def");
        String d = new String("def");

        boolean flag = (a == b);
        System.out.println(flag);

        System.out.println(flag = (c == d));
    }
}
