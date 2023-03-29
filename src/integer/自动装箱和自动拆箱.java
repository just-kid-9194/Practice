package integer;
/*
*   在java5后，引入了一种新特性，自动装箱和自动拆箱
*   自动装箱:基本数据类型自动转换成包装类。
*   自动拆箱:包装类自动转换成基本数据类型。
*
*   有了自动拆箱之后，Number类中的方法就用不着了!
*
*   自动装箱和自动拆箱有什么好处？
*       方便编程，不用再手动去装箱拆箱
* */
public class 自动装箱和自动拆箱 {
    public static void main(String[] args) {
        // 90日是基本数据类型
        // x是包装类型
        // 基本数据类型--(自动转换)-->包装类型:自动装箱
        Integer x = 900;
        System.out.println(x);

        // x是包装类型
        // y是基本数据类型
        // 包装类型--(自动转换)-->基本数据类型:自动拆箱
        int y = x;
        System.out.println(y);

        Integer z = 1000;
        // 分析这个为什么没有报错并且能正确运算呢？
        // +要求两边是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱，将z转换成基本数据类型
        System.out.println(z + 1);//1001
        /*
        String ss = "1000";
        System.out.println(ss + 1);//10001
        */


        Integer a = 1000;
        Integer b = 1000;
        Integer c = 15;
        Integer d = 15;
        Integer e = new Integer(12);
        Integer f = new Integer(12);
        // ==比较的是对象的内存地址,a和b两个引用中保存的对象内存地址不同。
        // ==这个运算符不会触发自动拆箱机制。（只有+-*/等运算的时候才会)
        // 这里有一点要注意，
        // Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]，保存了从-128~127范围的整数，
        // 给Integer赋值时在-128~127的范围内，可以直接使用数据中的元素，不用再去堆区创建
        // 故此范围的数据对象比较的时候， == 和equals的比较结果都为true.
        System.out.println(a == b);//false
        System.out.println(c == d);//true
        System.out.println(e == f);//false 与String同理
    }
}
