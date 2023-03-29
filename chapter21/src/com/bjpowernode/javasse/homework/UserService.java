package com.bjpowernode.javasse.homework;

public class UserService {
    private String username;

    private String password;

//    无参构造
    public UserService() {
    }

//    读写器
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @throws UserInformaticaException 当用户名为null，或者用户名长度小于6，或者长度大于14，会出现该异常!
     */
    public void register(String username, String password) throws UserInformaticaException {
        /*
        * 引用等于null的这个判断最好放到所有条件的最前面。
        *
        * 再分享一个经验: username == null不如写成 null == username,null放在前面避免手误写成username = null赋值
        * */
        if (null != username && username.length() >= 6 && username.length() <= 14){
            this.username = username;
        } else{
            throw new UserInformaticaException("用户名长度不合法！应在6到14字符之间");
        }
        this.password = password;
        System.out.println("注册成功！");
    }
}
