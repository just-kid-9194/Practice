package day003;

public class OverrideTest02 {
    public static void main(String[] args) {
        Chinese c = new Chinese("张三 ");
        c.speak();

        American a = new American("Jack");
        a.speak();

    }
}

//人
class People{
    //属性
    private String name;

//    构造
    public People(){}
    public People(String name){
        this.name = name;

    }
//    读写器
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    交流
    public void speak(){
        System.out.println(name+"正在说话");
    }

}

//中国人
class Chinese extends People{
//  构造
    public Chinese(){}
    public Chinese(String name){
        this.setName(name);
    }
    //    中国人说汉语
    @Override
    public void speak() {
        System.out.println(this.getName()+"正在说汉语");
    }
}
//美国人
class American extends People{

    //    构造
    public American(){}
    public American(String name){
        this.setName(name);
    }
    //    美国人说英语

    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking English");
    }
}