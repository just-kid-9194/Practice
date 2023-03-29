package super的概念;

public class Test01 {
    public static void main(String[] args) {
        new B(1);

    }
}

class A{
    public int anInt;

    public A(){
        System.out.println("A无参构造执行");
    }

    public A(int i){
        this();
        System.out.println("A有参构造执行");
    }
}

class B extends A{
    public B(){
        super(1);
        System.out.println("B无参构造执行");
    }

    public B(int i){
        this();
        System.out.println("B有参构造执行");
    }

}
