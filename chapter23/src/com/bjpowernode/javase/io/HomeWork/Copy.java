package com.bjpowernode.javase.io.HomeWork;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
//
        String oldFile = "D:\\下载文件\\第一章";
        String newFile = "D:\\files";
        fileCopy(oldFile,newFile);
    }

    static void fileCopy(String oldF,String newF){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        File oldFile = new File(oldF);
        String newF1 = oldF.replace(oldFile.getParent(),newF);
        System.out.println("新目录：:"+newF1);
        File newFile = new File(newF1);
        newFile.mkdir();

        File[] files = oldFile.listFiles();
        if(files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        fis = new FileInputStream(file);
                        bis = new BufferedInputStream(fis);
                        String x = file.getAbsolutePath().replace(oldFile.getParent(),newF);
                        System.out.println(x);
                        fos = new FileOutputStream(x);
                        bos=new BufferedOutputStream(fos);

                        byte[] bytes = new byte[1024 * 500];
                        int readCount = 0;
                        while ((readCount = bis.read(bytes)) != -1) {
                            bos.write(bytes, 0, readCount);
                        }

                        bos.flush();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (bis != null)
                                bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (bos != null)
                                bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                String oldFi = file.getAbsolutePath();
                    System.out.println("递归："+oldFi);
                fileCopy(oldFi,newF1);
            }
            }
        }
    }
}
