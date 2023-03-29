package com.bjpowernode.javase.io.File类;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* file类的常用方法
* */
public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("data");
//        获取文件名
        System.out.println("文件名：" + file.getName()); // 文件名：data

//        判断是否是一个目录
        System.out.println(file.isDirectory()); // false

//        判断是否是一个文件
        System.out.println(file.isFile());  // true

//        获取文件最后一次修改时间
        long mm = file.lastModified();
        Date time = new Date(mm);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String lastMod = sdf.format(time);
        System.out.println(lastMod);

//        获取文件大小
        System.out.println(file.length());
    }
}
