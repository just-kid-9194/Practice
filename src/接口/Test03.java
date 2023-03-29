package 接口;

/*
*   (五颗星*****):一个类可以同时实现多个接口。
*   这种机制弥补了java中的哪个缺陷?
*       java中类和类只支持单继承。实际上单继承是为了简单而出现的，现实世界中存在多继承,java中的接口弥补了单继承带来的缺陷。
* */

public class Test03 {
    public static void main(String[] args) {
        X x1 = new Try();
        Y y = (Y) x1;
        y.doSome();
        x1.m1();


//        经过测试:接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
//        但是一定要注意，运行时可能会出现classCastException异常。
        X x2 = new E();
        if(x2 instanceof Z){
            Z z = (Z) x2;   //编译不报错，运行时报类型转换错误
        }else {
            System.out.println("Fail to cast");
        }

    }
}

interface X{
    void m1();
}

interface Y{
    void doSome();
}

interface Z{

}

class Try implements X,Y,Z{
    /*public Try(int a ){

    }*/
    public void m1(){
        System.out.println("m1 ...");
    }

    public void doSome(){
        System.out.println("Cast succession");
    }
}

class E implements X{
    @Override
    public void m1() {
        System.out.println("m1 ...");
    }
}
