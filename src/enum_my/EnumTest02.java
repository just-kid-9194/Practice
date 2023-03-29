package enum_my;

//用枚举的方式改造程序
/*
* 总结:
    1、枚举是一种引用数据类型
    2、枚举类型怎么定义，语法是?
        enum枚举类型名{
            枚举值1,枚举值2
        }
    3、结果只有两种情况的，建议使用布尔类型。
      结果超过两种并且还是可以一枚一枚列举出来的，建议使用枚举类型。
* */
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10,2);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");

        switch (r){
            case SUCCESS:
                System.out.println("计算成功");
                break;
            case FAIL:
                System.out.println("计算失败");
                break;
        }
    }

    /**
     * 判断两int数据类型除法是否执行成功
     * @param a int类型数据
     * @param b int类型数据
     * @return 返回SUCCESS表示计算成功，返回FAIL表示计算失败
     */
    public static Result divide(int a, int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch(Exception e){
            return Result.FAIL;
        }
    }
}

//可以一枚一枚列举出来的情况，才建议使用枚举类型
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型。
//枚举中的每一个值可以看做是常量。
enum Result{
//    SUCCESS是枚举Result类型中的一个值
//    FAIL是枚举Result类型中的一个值
//    枚举中的每一个值，可以看做是“常量”
    SUCCESS,FAIL
}