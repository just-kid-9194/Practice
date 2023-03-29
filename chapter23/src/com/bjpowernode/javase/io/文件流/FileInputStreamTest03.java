package com.bjpowernode.javase.io.文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream的其他常用方法:
    1.int available(): 返回流当中剩余的没有读到的字节数量
    2.long skip(long n):跳过几个字节不读
*/
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\下载文件\\动力节点\\tt.txt");
            byte[] bytes = new byte[fis.available()];
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));
            System.out.println("剩下多少个字节没有读：" + fis.available());    // 5

//            fis.skip(3);
//            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
