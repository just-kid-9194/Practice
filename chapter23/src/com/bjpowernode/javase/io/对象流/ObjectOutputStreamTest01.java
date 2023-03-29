package com.bjpowernode.javase.io.对象流;


import com.bjpowernode.javase.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
* 1、java.io.NotSerializableException :Student对象不支持序列化!!!!
*
* 2、参与序列化和反序列化的对象，必须实现serializable接口。
*
* 3、注意:通过源代码发现，Serializable接口只是一个标志接口:
*   public interface Serializable {
*   }
*   这个接口当中什么代码都没有。
*   那么它起到一个什么作用呢?
*           起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇。
*           Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号。
*
* 4.序列化版本号有什么用？
*
* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
//        创建java对象
        Student s1 = new Student(1111,"张三");
//        序列化
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Student"));
//            序列化对象
            oos.writeObject(s1);
//            刷新
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                关闭
                if(oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
