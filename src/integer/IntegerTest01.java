package integer;
/*
* java中为8种基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是object。
*
* 思考:为什么要再提供8种包装类呢?
*   因为8种基本数据类型不够用。
*   所以SUN又提供对应的8种包装类型。
* */
public class IntegerTest01 {
    public static void main(String[] args) {
        doSome(1);
    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
