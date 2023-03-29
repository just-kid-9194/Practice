package 接口在开发中的作用;
//西餐厨师
public class AmericaCooker implements FoodMenu{
    @Override
    public void xiHongShiChaoDan() {
        System.out.println("西式西红柿炒蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("西式鱼香肉丝");
    }
}
