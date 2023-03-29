package 多态的基础语法;
//鸟类，子类
public class Bird extends Animal{
//    对move方法进行重写

    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public static void hei(){
        System.out.println("还真行");
    }
}
