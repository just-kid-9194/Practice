package com.bjpowernode.javasse.homework;

import java.util.Scanner;

public class UserTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：(长度在6到14字符之间)");
        String username = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();

        UserService us = new UserService();
        try {
            us.register(username,password);
        } catch (UserInformaticaException e) {
            System.out.println(e.getMessage());
        }
    }
}
