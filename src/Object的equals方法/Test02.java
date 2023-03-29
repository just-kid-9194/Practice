package Object的equals方法;

public class Test02 {
    public static void main(String[] args) {
        Address a1 = new Address("郑州","金水","11111");
        Address a3 = new Address("郑州","金水","11111");
        Address a2 = new Address("北京","房山","22222");

        Student s1 = new Student("张三",18,a1);
        Student s3 = new Student("张三",18,a1);
        Student s2 = new Student("李四",22,a2);

        System.out.println(s1.equals(s3));
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

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Address)) return false;
        if(obj == this) return true;
        Address address = (Address) obj;
        if(this.city.equals(address.city)
                && this.street.equals(address.street)
                && this.zipcode.equals(address.zipcode))
            return true;
        return false;
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

    public  boolean equals(Object obj){
        if(obj == null || !(obj instanceof Student)) return false;
        if(this == obj) return true;

        Student student = (Student) obj;
        if(this.name.equals(student.name)
            && this.age == student.age
            && this.addr.equals(student.addr))
            return true;

        return false;

    }
}
