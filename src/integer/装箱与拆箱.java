package integer;
/*
* 8种基本数据类型对应的包装类型名是什么？
*   基本数据类型          包装类型
* ----------------------------------
*   byte                java.lang.Byte
*   short               java.lang.Short
*   int                 java.lang.Integer
*   long                java.lang.Long
*   float               java.lang.Float
*   double              java.lang.Double
*   boolean             java.lang.Boolean
*   char                java.lang.Character
*
* 以上八种包装类中，重点以java.Lang.Integer为代表进行学习，其它的类型照葫芦画瓢就行。
* */
public class 装箱与拆箱 {
    public static void main(String[] args) {
//        123这个基本数据类型，进行构造方法的包装达到了:基本数据类型向引用数据类型的转换。
//        基本数据类型-(转换为)->引用数据类型（装箱)
        Integer i = new Integer(114);

//        将引用数据类型--(转换为)->基本数据类型
        float f = i.floatValue();
        short s = i.shortValue();
        System.out.println(f);
        System.out.println(s);

//        将引用数据类型--(转换为)->基本数据类型(拆箱)
        int retValue = i.intValue();
        System.out.println(retValue);
    }


}
