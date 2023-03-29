package day002;

/*
请通过代码封装,实现如下需求:
编写一个类Book,代表教材:
1.具有属性:名称(title) 、页数(pageNum)
2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200.为各属性提供赋值和取值方法
4.具有方法:detail，用来在控制台输出每本教材的名称和页数
5.编写测试类BookTest进行测试:为Book对象的属性赋予初始值，并调用Book对象的detail
*/

public class Homework1 {
    public static void main(String[] args) {
        Book a = new Book("罗曼史",528);
        Book b = new Book();
        b.setTitle("西方战争史");
        b.setPageNum(199);

        a.detail();
        b.detail();

    }
}

class Book{
    //名称
    private String title;
    //页数
    private int pageNum;
    //无参构造
    public Book(){
        title = "未知";
        pageNum = 200;
    }
    //有参构造
    public Book(String s,int i){
        title = s;
        pageNum = i;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println("错误信息");
            this.pageNum = 200;
            return;
        }
        this.pageNum = pageNum;
    }

    public void detail(){
        System.out.println(title+" "+pageNum+"页");
    }

}