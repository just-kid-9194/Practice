package Date;
/*
* 日历类
* */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.print(cal.get(cal.YEAR) + "年");
        System.out.print((cal.get(cal.MONTH)+1) + "月");
        System.out.print(cal.get(cal.DAY_OF_MONTH) + "日");
        System.out.print(cal.get(cal.HOUR_OF_DAY) + "时");
        System.out.print(cal.get(cal.MINUTE) + "分");
        System.out.println(cal.get(cal.SECOND) + "秒");
    }
}
