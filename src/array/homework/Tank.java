package array.homework;

public class Tank extends Weapon implements AttackAble,MoveAble{
    @Override
    public void attack() {
        System.out.println("坦克正在攻击！");
    }

    @Override
    public void move() {
        System.out.println("坦克正在移动！");
    }
}
