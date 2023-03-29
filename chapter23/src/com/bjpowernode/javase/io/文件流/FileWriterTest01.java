package com.bjpowernode.javase.io.文件流;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter：
* 文件输出字符流，负责写。
* 只能输出普通文本。
* */
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\下载文件\\动力节点\\t1",true);
            char[] chars = {13,10,97,98,99,100,101};
            fw.write("三杯吐然诺，五岳倒为轻");
            fw.write(chars);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
