package com.bjpowernode.javase.io.缓冲流;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // 字节流
            FileInputStream in = new FileInputStream("chapter23/src/com/bjpowernode/javase/io/File/copy01.java");
//            通过转换流转换，将字节流转换为字符流
            InputStreamReader isr = new InputStreamReader(in);
//            这个构造方法只能传字符流，不能传字节流。
            br = new BufferedReader(isr);

            String readLine = null;
            while ((readLine = br.readLine()) != null){
                System.out.println(readLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
