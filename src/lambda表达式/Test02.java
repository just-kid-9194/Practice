package lambda表达式;
/*
基本使用
    1.无返回函数式接口
*/
//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值两个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
public class Test02 {
    public static void main(String[] args) {
        NoParameterNoReturn n = ()->{
            System.out.println("无参数无返回值");
        };
        n.test();

        OneParameterNoReturn o = (a)-> {
            System.out.println("无返回值一个参数"+a);
        };
        o.test(666);
        MoreParameterNoReturn m = (int a,int b)->{
            System.out.println("无返回值两个参数"+a+" "+b);
        };
        m.test(666,999);
    }
}
