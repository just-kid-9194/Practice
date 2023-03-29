package Date;
/*
* java中对日期的处理
* 这个案例最主要掌握:
*   知识点1:怎么获取系统当前时间知识点
*   知识点2 : String ---> Date知识点
*   知识点3 : Date ---> String
* */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {
        // 获取系统当前时间（精确到毫秒的系统当前时间)
        // 直接调用无参数构造方法就行。
        Date nowTime = new Date();

        // java.utiL.Date类的toString()方法已经被重写了。
        // 输出的不是一个对象的内存地址，应该是一个日期字符串。
        System.out.println(nowTime);// Sat Nov 26 08:54:21 CST 2022

        // 日期可以格式化吗?
        // 将日期类型Date，按照指定的格式进行转换: Date --转换成具有一定格式的日期字符串-->String
        // SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        /*
        注意大小写区分
        * yyyy年(年是4位)
        * MM月（月是2位)
        * dd 日
        * HH 时
        * mm 分
        * ss 秒
        * sss 毫秒（毫秒3位，最高999。1000毫秒代表1秒)
        * */
        // 注意∶在日期格式中，除了y M d H m s S这些字符不能随便写之外，剩下的符号格式自己随意组织。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);// 2022-11-26 09:41:35 134

        // 假设现在有一个日期字符串string ，怎么转换成Date类型?
        // String --> Date
        String time = "2022-11-26 09:30:55 144";
        // 格式不能随便写，要和日期字符串格式相同
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);// Sat Nov 26 09:30:55 CST 2022
        System.out.println(sdf2.format(dateTime));//2022-11-26 09:30:55
    }
}
