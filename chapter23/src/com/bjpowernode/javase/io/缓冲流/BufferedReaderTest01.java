package com.bjpowernode.javase.io.缓冲流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* BufferedReader:
*   带有缓冲区的字符输入流。
*   使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
* */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader br = null;

        try {
            reader = new FileReader("chapter23/src/com/bjpowernode/javase/io/缓冲流/BufferedWriterTest01.java");
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做:节点流。
            // 外部负责包装的这个流，叫做:包装流，还有一个名字叫做:处理流。
            // 像当前这个程序来说:FiLeReader就是一个节点流。BufferedReader就是包装流/处理流。
            br = new BufferedReader(reader);

            String readLine = null;
            // br.readLine()方法读取一个文本行，但不带换行符
            while ((readLine = br.readLine()) != null){
                System.out.println(readLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
//                    只用关闭包装流，节点流会随着包装流自动关闭
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
