package package概念;

import java.util.Scanner;

/*
* 关于java语言中的package和import机制:
*   1、为什么要使用package？
*       package是java中包机制。包机制的作用是为了方便程序的管理。
*       不同功能的类分别存放在不同的包下。(按照功能划分的，不同的软件包具有不同的功能。)
*
*   2、package怎么用?
*       package是一个关键字，后面加包名。
*       例如:package com.bjpowernode.javase.chapter17;
*       注意：package语句只允许出现在java源代码的第一行。
*
*    3、包名有没有命名规范? 有
*       一般都采用公司域名倒序的方式（因为公司域名具有全球唯一性。)
*       包名命名规范：
*           公司名倒序 + 项目名 + 模块名 + 功能名
*
*   4
* */
public class PackageTest01 {
    public static void main(String[] args) {
        System.out.println("Hollow word");
        Scanner scan = new Scanner(System.in);
        double str = scan.nextInt();
        System.out.println(str + 2.4);


    }
}
