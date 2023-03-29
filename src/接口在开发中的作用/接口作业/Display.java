package 接口在开发中的作用.接口作业;

public class Display implements InsertDrawAble{
    @Override
    public void insertDraw() {
        System.out.println("已接入显示器！");
    }
}
