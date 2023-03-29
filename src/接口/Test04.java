package 接口;
/*
* 继承和实现同时出现，代码怎么写？
*   extends关键字在前，implements关键字在后
* */
public class Test04 {
    public static void main(String[] args) {
        Animal a = new Cat();
        if(a instanceof Flyable){
            System.out.println("可以转");
        }
        if(a instanceof Cat){
            Cat c = (Cat) a;
            c.fly();
            c.jump();
        }else{
            System.out.println("Fial to cast");
        }
    }
}

//动物类，父类
class Animal{

}

//可飞翔的接口
interface Flyable{
    void fly();
}

//可跳跃的接口
interface Jumpable{
    void jump();
}

//猫类，动物类子类
//将飞翔接口插在猫身上，让猫可以飞翔
class Cat extends Animal implements Flyable,Jumpable{
    public Cat() {
    }

    public void fly(){
        System.out.println("可以飞翔");
    }

    @Override
    public void jump() {
        System.out.println("可以跳跃");
    }

}