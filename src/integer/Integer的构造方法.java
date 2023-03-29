package integer;
/*
* 关于Integer类的构造方法，有两个:
*   Integer(int)
*   Integer(String)
* */
public class Integer的构造方法 {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        System.out.println(x);//123

        Integer y = new Integer("123");
        System.out.println(y);//123
    }
}
