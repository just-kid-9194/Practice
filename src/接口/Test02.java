package 接口;

/*
* 接口的基础语法：
*   1.类和类之间叫做继承，类和接口之间叫做实现。
*   别多想，仍然可以将“实现”看做“继承”。
*   继承使用extends关键字完成
*   实现使用implements关键字完成
* */
public class Test02 {
    public static void main(String[] args) {
        MyMath mm = new MyMathImpl();
        int x = mm.sub(6,4);
        System.out.println(x + "," + mm.sum(6,4));
        System.out.println(mm.PI);
    }
}

interface MyMath{
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}

class MyMathImpl implements MyMath{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
