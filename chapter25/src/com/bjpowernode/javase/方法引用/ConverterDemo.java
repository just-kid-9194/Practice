package com.bjpowernode.javase.方法引用;
/*
* 引用类方法，其实就是引用类的静态方法
* 格式：类名::静态方法
* 范例：Integer::parseInt
* Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据
* */
interface Converter{
    int convert(String s);
}

public class ConverterDemo{
    public static void main(String[] args) {
        //Lambda
        useConverter(s -> Integer.parseInt(s));
//        s -> Integer.parseInt(s) 可以推导为 Integer::parseInt
        Converter c = Integer::parseInt;
        //引用类方法
        useConverter(Integer::parseInt);


        //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
        //将Lambda中的s参数传递给静态方法parseInt,也就是如果Lambda中有多个参数,那么对应的静态方法就有多个
    }

    private static void useConverter(Converter c){
        int number = c.convert("666");
        System.out.println(number);
    }
}

