package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        Date time = new Date(1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String myTime = sdf.format(time);
        System.out.println(myTime);// 1970-01-01 08:00:00 001(东八区+8)
        // 获取昨天此时的时间
        Date time2 = new Date(System.currentTimeMillis() - 1000*60*60*24);
        String myTime2 = sdf.format(time2);
        // 当前时间
        System.out.println(sdf.format(new Date()));// 2022-11-26 11:02:06 182
        // 昨天此时时间
        System.out.println(myTime2);// 2022-11-25 11:02:06 182

        // System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));

    }
}
