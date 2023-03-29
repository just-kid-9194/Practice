package com.bjpowernode.javase.io.File类;

import java.io.File;

/*
* File类中的listFile方法
* */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFile() 获取当前目录下的所有子文件
        File f = new File("D:\\Program Files (x86)\\Tencent\\WeChat");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
