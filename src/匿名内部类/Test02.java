package 匿名内部类;
/*
* 匿名内部类案例
* */
public class Test02 {
    public static void main(String[] args) {
        new Student().read();//创建Student对象，调用read方法

//        接口不能直接创建对象，用匿名内部类将其实现后再调用接口方法
//        相当于用接口的实现类创建对象，再调用其方法
        new FlyAble() {
            @Override
            public void fly() {

            }
        }//匿名内部类将接口实现
        .fly();
    }
}
