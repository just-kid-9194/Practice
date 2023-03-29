package number;

import java.math.BigDecimal;

/*
* 1.BigDecimal 大数据，精度极高，不属于基本类型，属于java对象(引用数据类型)
* 这是Sun公司提供的一个类，专门用在财务软件当中
*
* 2.注意:财务软件中double是不够的。咱们之前有一个学生去用友面试，经理就问了这样一个问题:
* 你处理过财务数据吗﹖用的哪一种类型?
*   千万别说double，说java.math.BigDecimal
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal(100);
        BigDecimal value2 = new BigDecimal(200);

//        两个引用运算不能直接用‘+’‘-’等运算符
//        调用方法求和
        BigDecimal value3 = value1.add(value2);
        System.out.println(value3);// 300
//        相减
        BigDecimal value4 = value2.subtract(value1);
        System.out.println(value4);// 100
//        相乘
        BigDecimal value5 = value1.multiply(value2);
        System.out.println(value5);// 20000
//        相除
        BigDecimal value6 = value2.divide(value1);
        System.out.println(value6);// 2

        Person person = new Person();
        person.bd = BigDecimal.valueOf(2);
        System.out.println(person.bd); //2

        BigDecimal value7 = new BigDecimal(10);
        BigDecimal value8 = new BigDecimal(3);
        BigDecimal value9 = new BigDecimal(6);
//        进一法
        System.out.println(value7.divide(value8,2,BigDecimal.ROUND_UP));//3.34
//        去尾法
        System.out.println(value7.divide(value9,3,BigDecimal.ROUND_FLOOR));//1.666
//        四舍五入法
        System.out.println(value7.divide(value9,2,BigDecimal.ROUND_HALF_DOWN));//1.67
    }
}

class Person{
    BigDecimal bd;
}
