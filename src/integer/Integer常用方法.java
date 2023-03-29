package integer;
/*
* 总结一下之前所学的经典异常?
*   空指针异常: NullPointerException
*   类型转换异常: classCastException
*   数组下标越界异常: ArrayIndexOut0fBoundsException
*   数字格式化异常: NumberFormatException
* */
public class Integer常用方法 {
    public static void main(String[] args) {
        //重点方法
        //static int parseInt(String s)
        //传参String，返回int
        int retValue = Integer.parseInt("123");
        System.out.println(retValue);
        //同理
        double retDouble = Double.parseDouble("123.14");
        System.out.println(retDouble + 1);

        float retFloat = Float.parseFloat("123");
        System.out.println(retFloat);

    }
}
