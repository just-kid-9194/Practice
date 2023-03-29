package StringBuffer和StringBuilder;
/*
*   如果以后需要进行大量字符串的拼接操作，建议使用JDK中自带的:
*       java.Lang .StringBuffer
*       java.Lang .StringBuilder
*   如何优化StringBuffer的性能?
*       在创建stringBuffer的时候尽可能给定一个初始化容量。
*       最好减少底层数组的扩容次数。预估计一下，给一个大一些初始化容量。
* */
public class StringBufferTest01 {
    public static void main(String[] args) {
        String s = "is";
//        这样做会给java的方法区字符串常量池带来很大的压力。
        /*for (int i = 0; i < 20; i++) {
            s = s + i;
            System.out.println(s);
        }*/
//        创建一个初始1化容为16个byte[]教组。 (字符串缓冲区)
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            stringBuffer.append(i);
            System.out.println(stringBuffer);
        }
    }
}
