package com.bjpowernode.javase.io.文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read( byte[] b)
    一次最多读取b.length个字节。
    减少硬盘和内存的交互，提高程序的执行效率。
    往byte[]数组当中读。
*/
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
//            相对路径的话呢﹖相对路径一定是从当前所在的位置作为起点开始找!
//            IDEA默认的当前路径是当前工程的根目录。
            fis = new FileInputStream("D:\\下载文件\\动力节点\\tt.txt");
//            开始读，采用byte[]数组一次读取多个字节，最多读取“数组.length”个字节。
            byte[] bytes = new byte[3]; //准备一个长度为4的数组，一次最多读取四个字节
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount,"utf-8"));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
