package 多态的基础语法;
/*2.1.多态练习题
    编写程序模拟主人"喂养宠物”的场景:提示1:
    主人类:Master宠物类:Pet
    宠物类子类:Dogcat- Yingwu提示2:
    主人应该有喂养的方法:feed ()龙物应该有吃的方法:eat
    只要主人喂宠物,宠物就吃。
    要求:主人类中只提供一个喂养方法feed()，要求达到可以喂养各种类型的宠物。
    编写测试程序:
    创建主人对象
    创建各种崧物对象
    调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
    通社该案例,理解多态在开发中的作用。
    重要提示:feed方法是否需要一个参数，参数选什么类型!! !
*/
public class Test02 {
    public static void main(String[] args) {
        Master m = new Master();
        m.feed(new Parrot());
        m.feed(new Cat02());
        m.feed(new Dog());

    }
}
