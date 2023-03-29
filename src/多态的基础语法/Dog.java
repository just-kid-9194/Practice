package 多态的基础语法;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗在吃饭");
    }
}
