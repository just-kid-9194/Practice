package array;

import com.bjpowernode.javasse.exception.MyStackOperationException;

public class MyStack {
    Object[] objs;

    private int index = -1;

    public MyStack() {
        this(new Object[5]);
    }

    public MyStack(Object[] objs) {
        this.objs = objs;
    }

    public void push(Object obj) throws MyStackOperationException {
        if(index == objs.length-1){
            //System.out.println("栈满！压栈失败！！！");
            //创建异常对象
            MyStackOperationException e = new MyStackOperationException("栈满！压栈失败！！！");
            //手动将异常跑出去
            throw e;//如果这里捕捉没有意义，自己new一个异常，自己捉，没有意义。栈已满这个信息你需要传递出去。
        }else{
            index++;
            objs[index] = obj;
            System.out.println("已压栈");
            if(index == objs.length-1){
                System.out.println("栈满！");
            }
        }

    }

    public void pop() throws MyStackOperationException {
        if(index < 0){
            //System.out.println("栈空！弹栈失败！！！");
            throw new MyStackOperationException("栈空！弹栈失败！！！");
        }else{
            objs[index] = null;
            System.out.println("已弹栈");
            index--;
            if(index < 0){
                System.out.println("栈空！");
            }
        }
    }
}
