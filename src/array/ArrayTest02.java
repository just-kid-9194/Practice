package array;

public class ArrayTest02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        for(int i = 0; i < animals.length; i++){
            if(i%2 == 0){
                animals[i] = new Bird();
            }else{
                animals[i] = new Cat();
            }
        }

        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Cat){
                Cat c = (Cat) animals[i];
                c.catchMouse();
            }else if(animals[i] instanceof Bird){
                Bird b = (Bird) animals[i];
                b.eat();
            }
        }

    }

}

class Animal{
    public void move(){
        System.out.println("move...");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public void eat(){
        System.out.println("鸟在吃虫子");
    }
}
