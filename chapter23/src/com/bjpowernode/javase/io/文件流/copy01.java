package com.bjpowernode.javase.io.文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 使用FileInputStream + FileOutputStream完成文件的拷贝。
* 拷贝的过程应该是一边读，一边写。
* 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。
* 什么样的文件都能拷贝。
* */
public class copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Users\\86178\\Pictures\\interlude_28.png");
            fos = new FileOutputStream("D:\\图片\\interlude_28.png");

//            一边读一边写
            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }

//            刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
