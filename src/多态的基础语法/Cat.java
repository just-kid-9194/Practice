package 多态的基础语法;
//猫类，子类

public class Cat extends Animal {
//    对move方法进行重写

    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

//        猫特有的行为
     public void catchMouse(){
         System.out.println("猫在抓老鼠");

     }

}
