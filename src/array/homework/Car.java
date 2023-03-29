package array.homework;

public class Car extends Weapon implements MoveAble{
    @Override
    public void move() {
        System.out.println("汽车正在移动！");
    }
}
