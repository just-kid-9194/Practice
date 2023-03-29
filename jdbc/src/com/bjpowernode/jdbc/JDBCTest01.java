package com.bjpowernode.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest01 {
    public static void main(String[] args) {

        try {
            //        注册驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            //        获取连接
            /*
            * url:统一资源定位符（网络中某个资源的绝对路径）
            * https://www.baidu.com/ 这就是URL
            *
            * URL包括哪几部分？
            *   协议
            *   IP
            *   PORT(端口)
            *   资源名
            *
            * http://220.181.38.150:80/index.html
            *   http:// 通信协议
            *   220.181.38.150 服务器ip地址
            *   80 服务器端口号
            *   index.html 服务器上的某个资源名
            *
            * jdbc:mysql://localhost:3306/powernode
            *   jdbc:mysql:// 协议
            *   127.0.0.1(localhost) IP地址
            *   3306 mysql数据库端口号
            *   powernode 具体的数据库实例名
            * */
            String url = "jdbc:mysql://localhost:3306/powernode";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("数据库连接对象: " + conn);// com.mysql.cj.jdbc.ConnectionImpl@525f1e4e

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        获取数据库对象
//        执行SQL语句
//        处理查询结果集
//        释放资源
    }
}
