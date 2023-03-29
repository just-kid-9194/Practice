package array.homework;

public class Test01 {
    public static void main(String[] args) {
        Army army= new Army(10);
        army.addWeapon(new Sword());
        army.addWeapon(new Car());
        army.addWeapon(new Tank());
        army.addWeapon(new Car());
        army.addWeapon(new Sword());
        army.addWeapon(new Tank());
        army.addWeapon(new Sword());
        army.addWeapon(new Tank());
        army.addWeapon(new Car());
        army.addWeapon(new Tank());
        army.addWeapon(new Car());

        army.attackAll();
        army.moveAll();
    }
}
