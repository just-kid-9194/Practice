package array;
/*
*为某个酒店编写程序:酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
*   1、该系统的用户是:酒店前台.
*   2、酒店中所有的房间使用一个二维数组来模拟。
*   3、酒店中的每一个房间应该是一个java对象:Room
*   4、每一个房间Room应该有:房间编号、房间类型属性、房间是否空闲.
**/
public class ArrayTest06 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.Initialization();
        hotel.traverse();
        System.out.println("================================");
        hotel.reserve(201);
        hotel.reserve(201);
        hotel.reserve(312);
        hotel.reserve(405);
        hotel.reserve(102);
        hotel.reserve(206);
        hotel.reserve(8);
        hotel.traverse();
        System.out.println("================================");
        hotel.checkOut(201);
        hotel.checkOut(201);
        hotel.checkOut(312);
        hotel.checkOut(405);
        hotel.checkOut(413);
        hotel.traverse();
    }
}

class Hotel{
    private Room[][] rooms;

    public Hotel() {
        this(new Room[4][12]);
    }

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }
//初始化房间对象
    public void Initialization(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room((i+1)*100+j+1,"商务套房",true);
            }
        }
        System.out.println("初始化完毕...");
    }
//遍历房间状态
    public void traverse(){
        for (int i = 0; i < getRooms().length; i++) {
            System.out.print("{");
            for (int j = 0; j < getRooms()[i].length; j++) {
                System.out.print("[" + getRooms()[i][j].getNumber() +
                        " " + getRooms()[i][j].isEmpty +
                        "]");
                if(j == getRooms()[i].length-1){
                    System.out.println("}");
                }else{
                    System.out.print(",");
                }
            }
        }
        System.out.println("遍历完毕...");
    }

//    预订房间
    public void reserve(int number){
        int i = number/100 - 1;
        int j = number%100 -1;
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length){
            System.out.println("房间信息错误！！！");
            return;
        }
        if(rooms[i][j].isEmpty == false){
            System.out.println("预定失败！房间已被预定");
        }else{
            rooms[i][j].isEmpty = false;
            System.out.println("预定成功！");
        }
    }

//    退房
    public void checkOut(int number){
        int i = number/100 - 1;
        int j = number%100 -1;
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length){
            System.out.println("房间信息错误！！！");
            return;
        }
        if(rooms[i][j].isEmpty == true){
            System.out.println("退房失败！请检查房间信息");
        }else{
            rooms[i][j].isEmpty = true;
            System.out.println("退房成功！");
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}

class Room{
    private int number;
    private String type;
    public boolean isEmpty;

    public Room() {
        this(000,"商务套房",true);
    }

    public Room(int number, String type, boolean isEmpty) {
        this.number = number;
        this.type = type;
        this.isEmpty = isEmpty;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
