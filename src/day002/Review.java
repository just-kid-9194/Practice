package day002;
/*
    类体{
        实例变量；
        实例方法；

        静态变量；
        静态方法；

        构造方法；

        静态代码块；
        实例语句块；

        方法(){
            //局部变量
            int i = 100;
        }
    }

*/


public class Review {
    //入口
    //静态方法
    public static void main(String[] args) {
        //局部变量
        int i = 100;
    }
}

//学生类
class Student{
    //学号
    private int no;     //实例变量
    //姓名
    private String name;

    static String job = "学习";   //静态变量

    //构造方法
    public Student(){
        this(100,"张三");
    }
    public Student(int no,String name){
        this.no = no;
        this.name = name;
    }

    //setter and getter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNo(int no){
        this.no = no;
    }

    public int getNo(){
        return no;
    }
}
