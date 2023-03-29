package com.bjpowernode.javase.io.File类;

import java.io.File;
import java.io.IOException;

/*
* File
*   1、FiLe类和四大家族没有关系，所以File类不能完成文件的读和写。
*   2、File对象代表什么?
*       文件和目录路径名的抽象表示形式。
*       C:\Drivers这是一个File对象
*       C:\Drivers\Lan\Realtek\Readme.txt也是FiLe对象。
*       一个File对象有可能对应的是目录，也可能是文件。
*       File只是一个路径名的抽象表示形式。
*   3、需要掌握File类中常用的方法
* */
public class FileTest01 {
    public static void main(String[] args) {
//        创建一个File对象
        File file = new File("D:/file");
//        file.exists() 判断文件是否存在
        System.out.println(file.exists());
//        如果文件不存在，则以文件的形式创建出来
        /*if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

//        如果文件不存在，则以目录的形式创建出来
        /*if(!file.exists()){
            file.mkdir();
        }*/

//        可以创建多重目录吗？可以
        /*File file2 = new File("D:/file/a/b/c");
        if(!file2.exists()){
            file2.mkdirs();
        }*/

        File file3 = new File("D:\\下载文件\\第一章");
//        获取文件的父路径
        String parentPath = file3.getParent();
        System.out.println(parentPath);
        File parentFile = file3.getParentFile();
        System.out.println("获取绝对路径:" + parentFile.getAbsolutePath());
//        获取文件绝对路径
        File file4 = new File("copy.txt");
        System.out.println("获取绝对路径：" + file4.getAbsolutePath());

    }
}
