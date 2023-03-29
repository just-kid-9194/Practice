package string;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class String类中的常用方法 {
    public static void main(String[] args) {
//       1(掌握). char charAt(int index) ,返回字符串中指定下标或索引的char值
        char c = "中国人".charAt(1);
        System.out.println(c);// 国

//        2(了解).int compareTo(String anotherString) 按照字典顺序比较两个字符串
        int result1 = "abc".compareTo("abc");
        System.out.println(result1);//0 前后一致

        int result2 = "abcd".compareTo("abce");
        System.out.println(result2);//-1 前小后大

        int result3 = "abce".compareTo("abcd");
        System.out.println(result3);// 1 前大后小

        //拿着字符串第一个字母和后面字符串的第一个字母比较。能分胜负就不再比较了。
        int result4 = "abc".compareTo("cba");
        System.out.println(result4);// -2 a比c小2

        int result5 = "111".compareTo("11");
        System.out.println(result5);

//        3.(掌握) boolean contains(CharSequence s) 判断前面的字符串中是否包含后面的子字符串。
        boolean flag = "test.txt".contains(".tx");
        System.out.println(flag);//true

//        4.(掌握) boolean endsWith(String suffix) 判断当前字符串是否以某个字符串结尾。
        boolean flag2 = "test.txt".endsWith(".txt");
        System.out.println(flag2);//true

//        5.(掌握) boolean equalsIgnoreCase(String anotherString) 将此String与另一个String进行比较，忽略大小写考虑。
        boolean flag3 = "Test.TXT".equalsIgnoreCase("test.txt");
        System.out.println(flag3);//true

        // 6(掌握).booLean equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用"=="
        // equals只能看出相等不相等。
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小。
        boolean flag4 = "test.txt".equals("Test.txt");
        System.out.println(flag4);//false

//        7.(掌握) byte[] getBytes() 将字符串转换成字节数组
        byte[] bytes = "abn1POW我哦哟".getBytes();
//        System.out.println(new String(bytes));
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + ",");
        }//97,98,110,49,80,79,87,-26,-120,-111,-27,-109,-90,-27,-109,-97,
        System.out.println();

//        8.(掌握) int indexOf(String str) 返回某字符串在当前字符串中首次出现处的索引(下标)。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("c++"));//10

//        9.(掌握) boolean isEmpty() 判断某个字符串是否为空
        System.out.println("".isEmpty());//true

//        10.(掌握)int length() 返回字符串长度
//        面试题:判断数组长度和判断字符串长度不一样
//        判断数组长度是length属性，判断字符串长度是Length()方法。
        System.out.println("abcx".length());//4

//        11.(掌握) int lastIndexOf(String str) 返回某字符串在当前字符串中最后一次出现处的索引(下标)。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".lastIndexOf("c++"));//38

//        12.(掌握) String replace(CharSequence target, CharSequence replacement)
//          将当前字符串的某段子字符串替换为新字符串
        System.out.println("name=zhangsan&password=123&age=20".replace("=",":"));
//        name:zhangsan&password:123&age:20

//        13.(掌握) String[] split(String regex) 拆分字符串
        String[] strs = "2022/11/23".split("/");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " ");
        }//2022 11 23

        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
        }//name=zhangsan password=123 age=20

//        14.(掌握) boolean startsWith(String prefix) 判断该字符串是否以某个字符串开始
        boolean flag5 = "https://nmt.youdao.com/".startsWith("https");
        System.out.println(flag5);//true

//        15.(掌握) String substring(int beginIndex) 截取字符串 参数为起始下标
        System.out.println("https://nmt.youdao.com/".substring(8));//nmt.youdao.com/
//        16.(掌握) String substring(int beginIndex, int endIndex) 截取字符串方法重载 参数为起始下标和结束下标
        System.out.println("https://nmt.youdao.com/".substring(8,22));//nmt.youdao.com

//        17.(掌握) char[] toCharArray() 将字符串转换成char数组
        char[] chars = "我是中国人IamChinese233".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }//我是中国人IamChinese233
        System.out.println();

//        18.(掌握) String toLowerCase() 转换成小写
        System.out.println("I Am CHiNESE".toLowerCase());//i am chinese

//        19.(掌握) String toUpperCase() 转换成大写
        System.out.println("i am Chinese".toUpperCase());//I AM CHINESE

//        20.(掌握) String trim() 去除字符串前后空白
        System.out.println("  yes we can     ");
        System.out.println("  yes we can     ".trim());

//        21.(掌握) String类中只有一个方法是静态的，不需要new对象
//        这个方法叫做valueOf
//        作用是将非字符串转换为字符串
        String str2 = String.valueOf(chars);







        System.out.println(str2);
        Custemer cus = new Custemer();
        System.out.println(cus);//string.Custemer@1b6d3586

    }
}

class Custemer{

}
