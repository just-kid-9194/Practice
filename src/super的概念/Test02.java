package super的概念;

public class Test02 {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d);

        C c = new C();
        System.out.println(c.getA() + c.getB());
    }
}

class C{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public C(){

        this(10,5);
    }

    public C(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a +","+ b);
    }
}

class D extends C{
//    private int a;

    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public D(){
        this(5,6,12);
    }

    public D(int a,int b,int c){

        this.c = c;
        setA(a);
        setB(b);
    }

    @Override
    public String toString() {
        return "D{" +
                "a=" + getA() +
                "b=" + getB() +
                "c=" + c +
                '}';
    }
}