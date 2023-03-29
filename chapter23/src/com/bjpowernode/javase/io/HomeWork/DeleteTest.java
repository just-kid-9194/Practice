package com.bjpowernode.javase.io.HomeWork;

import java.io.File;

public class DeleteTest {
    public static void main(String[] args) {
        String s = "D:\\files\\第一章";
        dirDel(s);
    }

    static void dirDel(String destFile){
        File file = new File(destFile);
        File[] files = file.listFiles();
        if (files == null) {
            file.delete();
        }else{
            for (File file1 : files) {
                if (file1.isFile()){
                    file1.delete();
                }else{
                    dirDel(file1.getAbsolutePath());
                    file1.delete();
                }
            }
            file.delete();
        }
    }
}
