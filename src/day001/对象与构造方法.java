package day001;

public class 对象与构造方法 {
    public static void main(String[] args) {
        user u1 = new user(001,"小明",14);
        System.out.println(u1.name+","+u1.age+","+u1.id);

        user u2 = new user(002,"小美",18);
        System.out.println(u2.name+","+u2.age+","+u2.id);

        user u3 = u1;
    }


}

class user{
    int id;
    String name;
    int age;

    public user(int a,String b,int c){
        id = a;
        name = b;
        age = c;
    }

}