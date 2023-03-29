package array.homework;

public class Army {
    Weapon[] weapon;
    private int index;
    private int i;

    public Army(int index) {
        this.index = index;
        weapon = new Weapon[index];
    }

    public void addWeapon(Weapon wa ){
        boolean flag = false;
        while (i < weapon.length && !flag){
            if(null == weapon[i]){
                flag = true;
            } else {
                i++;
            }
        }

        if (flag){
            weapon[i] = wa;
            System.out.println("添加成功！");
        } else{
            System.out.println("添加失败！武器已满！");
        }
    }


    public void moveAll(){
        for (int i = 0; i < weapon.length; i++) {
            if(weapon[i] instanceof MoveAble){
                ((MoveAble) weapon[i]).move();
            }
        }
    }

    public void attackAll(){
        for (int i = 0; i < weapon.length; i++) {
            if(weapon[i] instanceof AttackAble){
                ((AttackAble) weapon[i]).attack();
            }
        }
    }
}
