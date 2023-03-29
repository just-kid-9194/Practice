package com.bjpowernode.javase.io.数据流;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.DataOutputStream :数据专属的流。
* 这个流可以将数据连同数据的类型一并写入文件。
* 注意:这个文件不是普通文本文档。（这个文件使用记事本打不开。)
* */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("D:\\下载文件\\动力节点\\data"));

            byte b = 'a';
            short s = 12;
            int i = 123;
            long l = 1234l;
            float f = 3.1f;
            double d = 3.14;
            boolean sex = true;
            char c = 'c';
//            将数据以及数据类型一并写入文件当中
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(sex);
            dos.writeChar(c);

            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
