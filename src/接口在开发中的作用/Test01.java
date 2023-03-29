package 接口在开发中的作用;

public class Test01 {
    public static void main(String[] args) {
        Student s = new Student("张三",22,new Address("郑州","博学路","15号"));
        System.out.println(s);

        Address a = new Address();
        System.out.println(a);

        Student s2 = new Student("李四",23,a);
        System.out.println(s2);
    }
}

class Address{
    private String city;
    private String street;
    private String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return city +street +zipcode;
    }
}

class Student{
    String name;
    int age;
    Address addr;

    public Student() {
    }

    public Student(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
//      这样写会报空指针异常，原因是没有为Address类创建对象却直接调用方法为实例变量赋值，蠢
    /*public Student(String name, int age, String city, String street, String zipcode) {
        this.name = name;
        this.age = age;
        this.addr.setCity(city);
        this.addr.setStreet(street);
        this.addr.setZipcode(zipcode);
    }*/

    public Address getAddr() {
        return addr;
    }

    public void setAddr(String city, String street, String zipcode) {
        this.addr.setCity(city);
        this.addr.setStreet(street);
        this.addr.setZipcode(zipcode);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
}