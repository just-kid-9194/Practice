package com.bjpowernode.javase.io.文件流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流，负责写
从内存到硬盘
*/
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            myFile文件不存在的时候会自动新建!
//            这种方式谨慎使用，这种方式会先将原文件清空，然后重新写入。
            //fos = new FileOutputStream("D:\\下载文件\\动力节点\\myFile");

            fos = new FileOutputStream("D:\\下载文件\\动力节点\\myFile",true);
//            开始写
            byte[] bytes = {97,98,99,100,13,10};
//            将数组全部写入
            fos.write(bytes);
//            将数组一部分写入
            fos.write(bytes,0,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
