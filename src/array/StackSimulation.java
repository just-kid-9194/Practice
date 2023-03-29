package array;

public class StackSimulation {

    public static void pop(Object[] objs){
        for (int i = objs.length-1; i >= 0; i--) {
            if(objs[i] != null){
                objs[i] = null;
                System.out.println("已弹栈");
                if(i == 0){
                    System.out.println("栈空！");
                }
                return;
            }
        }
        System.out.println("栈空！弹栈失败！！！");
    }

    public static void push(Object[] objs, Object obj){
        for (int i = 0; i < objs.length; i++){
            if(objs[i] == null){
                objs[i] = obj;
                System.out.println("已入栈");
                if(i == objs.length-1){
                    System.out.println("栈满！");
                }
                return;
            }
        }
        System.out.println("栈满！入栈失败！！！");
    }
}
