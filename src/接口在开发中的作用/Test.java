package 接口在开发中的作用;
/*
* 面向接口编程，可以降低程序的耦合度，提高程序的扩展力。符合oCp开发原则。接口的使用离不开多态机制。（接口+多态才可以达到降低耦合度。)
*
* 接口可以解耦合,解开的是谁和谁的耦合!! !
*   任何一个接口都有调用者和实现者。接口可以将调用者和实现者解耦合。
*   调用者面向接口调用。实现者面向接口编写实现。
* */
public class Test {
    public static void main(String[] args) {


//    创建厨师对象
        FoodMenu cooker1 = new ChinaCooker();
        FoodMenu cooker2 = new AmericaCooker();
//    创建顾客对象
        Customer customer1 = new Customer(cooker1);
        Customer customer2 = new Customer();
        customer2.setFoodmenu(cooker2);

        //    顾客点菜
        customer1.order();
        customer2.order();
    }
}
