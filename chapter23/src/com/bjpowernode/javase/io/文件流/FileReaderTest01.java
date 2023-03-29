package com.bjpowernode.javase.io.文件流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* FileReader：
*   文件字符输入流，只能读取普通文本
*   读取文本内容时，比较方便快捷
* */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
//            创建文件字符流
            fr = new FileReader("D:\\下载文件\\动力节点\\test.txt");
//            准备一个char数组
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1){
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
