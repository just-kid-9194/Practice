package array.homework;

public class Sword extends Weapon implements AttackAble{
    @Override
    public void attack() {
        System.out.println("剑正在攻击！");
    }
}
