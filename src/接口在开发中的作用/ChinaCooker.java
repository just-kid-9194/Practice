package 接口在开发中的作用;
//中餐厨师
public class ChinaCooker implements FoodMenu {
    @Override
    public void xiHongShiChaoDan() {
        System.out.println("中式西红柿炒蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("中式鱼香肉丝");
    }
}
