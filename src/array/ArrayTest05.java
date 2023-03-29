package array;

import com.bjpowernode.javasse.exception.MyStackOperationException;

/*
* 编写程序,使用一维数组,模拟栈数据结构。要求:
*   1、这个栈可以存储java中的任何引用类型的数据。
*   2、在栈中提供push方法模拟压栈。(栈满了，要有提示信息。)
*   3、在栈中提供pop方法模拟弹栈。(栈空了，也有有提示信息。)
*   4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
* */
public class ArrayTest05 {
    public static void main(String[] args) {

        boolean[][] booleans = new boolean[4][5];

//        对于StackSimulation的测试
        Object[] objs = new Object[5];
        StackSimulation.push(objs,"ohhh");
        StackSimulation.push(objs,"ohhh");
        StackSimulation.push(objs,"ohhh");
        StackSimulation.push(objs,"ohhh");
        StackSimulation.push(objs,"ohhh");
        StackSimulation.pop(objs);
//        没有模拟出栈的逻辑
        System.out.println("=======================");

//        对于Mystack的测试
        MyStack m = new MyStack(new Object[5]);
        try{
            m.push("yooo");
            m.push("yooo");
            m.push("yooo");
            m.push("yooo");
            m.push("yooo");
            m.push("yooo");


        } catch (MyStackOperationException e){
            e.printStackTrace();
        }

        try {
            m.pop();
            m.pop();
            m.pop();
            m.pop();
            m.pop();
            m.pop();
        } catch (MyStackOperationException e){
            e.printStackTrace();
        }
    }
}

