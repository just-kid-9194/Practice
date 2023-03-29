package com.bjpowernode.javase.io.文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
//            创建文件字节输入流对象
//            文件路径：D:\下载文件\动力节点\tt.txt
//            fis = new FileInputStream("D:\\下载文件\\动力节点\\tt.txt");
//            一下都是采用了绝对路径
//            写成/也是可以的
            fis = new FileInputStream("D:/下载文件/动力节点/tt.txt");
            /*while (true){
                int readData = fis.read();
                if(readData != -1){
                    System.out.println(readData);
                } else {
                    break;
                }
            }*/
            int readData = 0;
            while((readData = fis.read()) != -1){
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            在finally语句块中确保流一定关闭
//            关闭流的前提是：流不为空，为空没必要关闭
            if (fis != null) {  //防止空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
