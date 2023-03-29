/*
    在程序中经常要对时间进行操作但是并没有时间类型的数据。那么我们可以自己实现一个时间类来满足程序中的需要。
    定义名为MyTime的类其中应有三个整型成员时hour分minute秒second为了保证数据的安全性这三个成员变量应声明为私有。
    为MyTime类定义构造方法以方便创建对象时初始化成员变量。再定义diaplay方法用于将时间信息打印出来。
    为MyTime类添加以下方法
    addsecond (int sec)
    addMinute(int min)
    addHour (int hou)
    subsecond (int sec)
    subMinute (int min)
    subHour (int hou)
    分别对时、分、秒进行加减运算。
*/

public class Time {
    public static void main(String[] args) {
        MyTime mt = new MyTime(13,59,5);
        mt.subHour(15);
        System.out.println(mt.display());
    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this(13,34,25);
    }

    public MyTime(int hour, int minute, int second) {
        if(hour < 24 && hour >= 0 && minute >= 0 && minute < 60 && second >= 0 && second < 60){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else{
            System.out.println("输入不合法！！！");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

//    加减时间全部化秒计算，分为两类，进行时、分运算时调用秒运算

   public void addSecond (int sec){
        int x = getHour() * 3600 + getMinute() * 60 + getSecond() + sec;
        setHour(x/3600%24);
        setMinute(x/60%60);
        setSecond(x%60);
   }
/*   public void addMinute(int min) {
       int x = getHour() * 60 + getMinute() + min;
       setHour(x/60%24);
       setMinute(x%60);
   }*/
    public void addMinute(int min){
        this.addSecond(min * 60);
    }
/*   public void addHour (int hou)  {

        this.setHour((this.getHour() + hou)%24);
   }*/
    public void addHour (int hou){
        this.addSecond(hou * 3600);
    }


   public void subSecond (int sec){
        int x = getHour() * 3600 + getMinute() * 60 + getSecond() - sec + (sec/(24*3600)+1) * 24*3600;
        setHour((x/3600)%24);
        setMinute((x/60)%60);
        setSecond(x%60);
   }
   /*public void subMinute (int min){
        int x = getHour() * 60 + getMinute() - min + (min/(24*60)+1) * 24*60;
        setMinute(x%60);
        setHour((x/60)%24);
   }*/
    public void subMinute (int min){
       this.subSecond(min *60);
   }
    /*public void subHour (int hou)  {

        this.setHour((this.getHour() - hou + (hou/24+1) * 24) %24);
    }*/
    public void subHour (int hou){
        this.subSecond(hou * 3600);
    }

    public String display() {
        return "现在时间为 " +
                hour + "时" +
                minute + "分" +
                second + "秒" ;
    }
}

