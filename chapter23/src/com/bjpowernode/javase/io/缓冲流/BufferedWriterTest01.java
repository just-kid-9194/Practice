package com.bjpowernode.javase.io.缓冲流;

import java.io.*;

/*
* BufferedWriter :带有缓冲的字符输出流。
* OutputStreamWriter :转换流
* */
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
//            out = new BufferedWriter(new FileWriter("copy"));
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
            out.write("我爱中华");

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
