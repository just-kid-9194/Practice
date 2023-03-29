package day003;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class OverrideTest03 {
    public static void main(String[] args) {
        MyDate m = new MyDate();
//        System.out.println(m);
        A.test(m);

    }

}

class A{
    public static void test(MyDate myDate){
        System.out.println(myDate);
    }

}

class MyDate{


//    年月日
    private int year;
    private int month;
    private int day;

//    读写器
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//    构造方法
    public MyDate() {
        this(2022,12,1);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //    重写toString方法
    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}