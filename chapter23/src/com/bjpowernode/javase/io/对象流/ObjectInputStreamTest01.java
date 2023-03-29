package com.bjpowernode.javase.io.对象流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
* 反序列化
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("Student");
            ois = new ObjectInputStream(fis);
//            开始反序列化
            Object o = ois.readObject();
//            反序列化回来是一个学生对象，所以可以调用toString方法
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
