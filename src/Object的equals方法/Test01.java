package Object的equals方法;

import java.util.Objects;

public class Test01 {
    public static void main(String[] args) {
        MyDate t1 = new MyDate(2022,11,3);
        MyDate t2 = null;
//        null 与任何引用类型进行 instanceof 对比的结果都是 flase，null 不属于任何类型，更不属于 object 基类的派生类（子类）。
        System.out.println(t1.equals(t2));
//        System.out.println(t2.getDay());
        String s1 = "123";
        String s2 = "122";
        boolean i = (s1 == s2);
        System.out.println(i);
    }
}

class MyDate{
    private int year;
    private int mouth;
    private int day;

//    String x;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate() {
        this(2022,11,8);
    }

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", mouth=" + mouth +
                ", day=" + day +
                '}';
    }

    /*@Override
    public int hashCode() {
        return super.hashCode();
    }*/

    /*@Override
    public boolean equals(Object obj) {
        int day1 = this.day;
        int mouth1 = this.mouth;
        int year1 = this.year;

        if(obj instanceof MyDate){
            MyDate mt = (MyDate) obj;
            int day2 = mt.day;
            int mouth2 = mt.mouth;
            int year2 = mt.year;
            System.out.println("1");
            if(day1 == day2 && mouth1 == mouth2 && year1 == year2){
                return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && mouth == myDate.mouth && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, mouth, day);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && mouth == myDate.mouth && day == myDate.day && x.equals(myDate.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, mouth, day, x);
    }*/
}
