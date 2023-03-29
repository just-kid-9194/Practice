package 接口在开发中的作用.接口作业;

public class Laptop {
    private String user;
    private String type;
    private InsertDrawAble insertDrawAble;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InsertDrawAble getInsertDrawAble() {
        return insertDrawAble;
    }

    public void setInsertDrawAble(InsertDrawAble insertDrawAble) {
        this.insertDrawAble = insertDrawAble;
    }

    public Laptop() {
    }

    public Laptop(String user, String type, InsertDrawAble insertDrawAble) {
        this.user = user;
        this.type = type;
        this.insertDrawAble = insertDrawAble;
    }

    public void access(InsertDrawAble insertDrawAble){
        getInsertDrawAble().insertDraw();
    }
}
