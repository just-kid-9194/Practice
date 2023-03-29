package string;

import java.sql.SQLOutput;

/*
* 关于String类中的构造方法。
* */
public class String的常用构造方法 {
    public static void main(String[] args) {
        String str1 = "hellow";

        byte[] bytes = {85,86,87,88};
//        将byte数组转换成字符串
        String str2 = new String(bytes);
//          String(字节数组,数组元素下标的起始位置,长度)
//          byte数组中的一部分转换成字符串。
        String str3 = new String(bytes,1,2);

        System.out.println(str2);
        System.out.println(str3);

//        将char数组全部转换成字符串
        char[] chars = {'我','是','中','国','人'};
        String str4 = new String(chars);
//        将char数组一部分转换成字符串
        String str5 = new String(chars,2,3);

        System.out.println(str4);
        System.out.println(str5);
    }
}
