package com.bjpowernode.javase.io;
/*
* 6、java.io包下需要掌握的流有16个:
*   文件专属:
*       java.io.FileInputStream
*       java.io.FileOutputStream
*       java.io.FileReader
*       java.io.FileWriter
*
*   转换流:(将字节流转换成字符流>
*       java.io.InputStreamReader
*       java.io.OutputStreamWriter
*
*   缓冲流专属:
*       java.io.BufferedReader
*       java.io.BufferedWriter
*       java.io.BufferedInputStream
*       java.io.BufferedOutputStream
*
*   数据流专属:
*       java.io.DataInputStream
*       java.io.DataOutputStream
*
*   标准输出流:
*       java.io.PrintWriter
*       java.io.PrintStream
*
*   对象专属流:
*       java.io.ObjectInputStream
*       java.io.ObjectOutputStream
* */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //不写指定路径，会在项目下创建一个a.txt文件；
        FileOutputStream fos=new FileOutputStream("D:\\下载文件\\云和\\day28\\a.txt",true);  //?在哪里？
        //其他系统，先试验一个\n
        fos.write("\r\n".getBytes());
        fos.write(65);
        fos.write(66);
        //获取\n对应的字节数组；字节输出流，可以输出字节数组的内容;
        fos.write("\r\n".getBytes());
        fos.write(100);
        fos.flush();
        fos.close();


    }
}
