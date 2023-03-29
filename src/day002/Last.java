package day002;

//定义丈夫类Husband和妻子类wife,
//丈夫类的属性包括:身份证号，姓名，出生日期，妻子。妻子类的属性包括:身份证号，姓名，出生日期，丈夫。
//分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供）,编写测试程序，创建丈夫对象，然后再创建妻子对
//象，丈夫对象关联妻子对象，妻子对象关联丈夫对象，要求能够输出这个"丈夫对象"的妻子的名字，
//或者能够输出这个"妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。并且要求在程序中演示出空指针异常的效果。

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Last {
    public static void main(String[] args) throws ParseException {
        //创建丈夫对象
        Husband h1 = new Husband("0000000001","张三",new SimpleDateFormat("yyyy-MM-dd").parse("2011-10-13"),null);
        System.out.println(h1.birth);
        //创建妻子对象
//        Wife w1 = new Wife("0000000002","李四",2021-11-2,null);
//        //产生关联
//        h1.wife=w1;
//        w1.husband =h1;
//
//        System.out.println(h1.name+"的妻子是"+h1.wife);

    }
}

//丈夫类
class Husband{
    //身份证号
    String idCard;
    //姓名
    String name;
    //生日
    Date birth;
    //妻子
    Wife wife;

    //无参数构造方法
    public Husband(){

    }

    //有参数构造方法
    /*public Husband(String s1,String s2,Date d1,Wife w){
        idCard

    }*/

    public Husband(String idCard, String name, Date birth, Wife wife) {
        this.idCard = idCard;
        this.name = name;
        this.birth = birth;
        this.wife = wife;
    }
}

//妻子类
class Wife{
    //身份证号
    String idCard;
    //姓名
    String name;
    //生日
    Date birth;
    //丈夫
    Husband husband;

    //无参构造方法
    public Wife(){

    }

    //有参构造方法
    public Wife(String s1,String s2,Date d1,Husband h){

    }

}