package day001;

public class student {
    int studyID;        //学号
    String name;        //姓名
    int age;            //年龄
    boolean sex;        //性别
    String address;     //住址

    public void setStudyID(int studyID) {
        this.studyID = studyID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudyID() {
        return studyID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAddress() { return address; }
}
