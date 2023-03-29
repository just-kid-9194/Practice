package com.bjpowernode.javase.reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        FileReader reader = new FileReader(path);

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();*/

        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        Properties pro = new Properties();
        pro.load(stream);
        stream.close();

        String className = pro.getProperty("className");
        Class c = Class.forName(className);
        System.out.println(c);
    }
}
