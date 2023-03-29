package 接口在开发中的作用;
/*
* 1/顾客手里有一个菜单
* customer has a FoodMenu!(这句话什么意思:顾客有一个菜单)
* 记住:以后凡是能够使用has a来描述的，统一以属性的方式存在。
* cat is a Animal，但凡满足is a的表示都可以设置为继承。
* customer has a FoodMenu，但凡是满足has a的表示都以属性的形式存在。
* */
public class Customer {
//    实例变量，属性
    private  FoodMenu foodmenu;

    public Customer(){

    }

    public Customer(FoodMenu foodmenu){

        this.foodmenu = foodmenu;
    }

    public FoodMenu getFoodmenu() {

        return foodmenu;
    }

    public void setFoodmenu(FoodMenu foodmenu) {

        this.foodmenu = foodmenu;
    }

    public void order(){
        getFoodmenu().xiHongShiChaoDan();
        getFoodmenu().yuXiangRouSi();
    }

    /*@Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/
}
