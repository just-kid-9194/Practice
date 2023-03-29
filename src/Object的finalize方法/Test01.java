package Object的finalize方法;
/*
* 关于object类中的finalize()方法。
* 1、在object类中的源代码:
*   protected void finalize() throws Throwable {}
*
*   GC(垃圾回收器)：负责调用finalize()方法。
*
* 2、finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
*
* 3、这个方法不需要程序员手动调用，JVM的垃圾回收器负贲调用这个方法。
*   不像equals tostring,equals和tostring()方法是需要你写代码调用的。finalize()只需要重写，重写完将来自动会有程序来调用。
*
* 4、finalize()方法的执行时机:
*   当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负贲调用finalize()方法。
*
* 5、finalize()方法实际上是sUN公司为java程序员准备的一个时机，垃圾销毁时机。
*   如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize()方法当中。
*
* 6、静态代码块的作用是什么?
*   static {}
*   静态代码块在类加载时刻执行,并且只执行一次。这是一个sUN准备的类加载时机。
*   finalize()方法同样也是sUN为程序员准备的一个时机。这个时机是垃圾回收时机。
*
* 7、提示:
*   java中的垃圾回收器不是轻易启动的,垃圾太少，或者时间没到,种种条件下,有可能启动,也有可能不启动。
* */

public class Test01 {
    public static void main(String[] args) {
//        多造点垃圾，以启动垃圾回收器（这样容易把JVM搞炸...）
        /*for(int i = 0; i <= 2000000; i++){
            Persen p = new Persen();
            p = null;
        }*/

        for(int i = 0; i <= 1000; i++){
            Persen p = new Persen();
            p = null;
        }
//        有一段代码可以建议启动垃圾回收器
        System.gc();// 建议启动垃圾回收器（只是建议，可能不启动）
    }
}

class Persen{
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + "惹，要被吸入惹~");
    }
}

