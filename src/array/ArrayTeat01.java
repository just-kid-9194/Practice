package array;
/*
* Array
*   1、Java语言中的数组是一种引用数据类型。不属于基本数据类型。数组的父类是object。
*
*   2、数组实际上是一个容器，可以同时容纳多个元素。（数组是一个数据的集合。)
*       数组:字面意思是“一组数据”
*
*   3、数组当中可以存储基本数据类型的数据，也可以存储引用数据类型的数据。
*
*   4、数组因为是引用类型，所以数组对象是堆内存当中。(数组是存储在堆当中的)
*
*   5、数组当中如果存储的是"java对象”的话，实际上存储的是对象的引用（内存地址)”
*
*   6、数组一旦创建，在java中规定，长度不可变。（数组长度不可变)
*
*   7.数组的分类：一维数组，二维数组，三维数组，多维数组...(一维数组经常使用，二维数组偶尔使用)
*
*   8.所有数组对象都有length属性（Java自带的），用来获取数组中元素的个数。
*
*   9.Java中的数组要求数组中的元素统一。
*
*   10、数组在内存方面存储的时候，数组中的元素内存地址(存储的每一个元素都是有规则的按序排列的)是连续的。
*       内存地址连这是数组存储元素的特点（特色)。数组实际上是一种简单的数据结构。
*
*   11、所有的数组都是拿“第一个小方框的内存地址”作为整个数组对象的内存地址。
*
*   12、数组中每一个元素都是有下标的，下标从0开始，以1递增。最后一个元素的下标是: length - 1
*       下标非常重要，因为我们对数组中元素进行”存取“的时候，都要通过下标来进行。
*
*   13、数组这种数据结构的优点和缺点是什么?
*       优点:查询/查找/检索某个下标上的元秦时效率极高。可以说是查询效率最高的一个数据结构。
*           为什么检索效率高?
*               第一:每一个元素的内存地址在空间存储上是连续的。
*               第二:每一个元素类型相同，所以占用空间大小一样。
*               第三:知道第一个元素内存地址，知道每一个元素占用空间的大小，又知道下标，所以
*                   通过一个数学表达式就可以计算出某个下标上元素的内存地址。直接通过内存地
*                   址定位元素，所以数组的检索效率是最高的。
*
*               数组中存储100个元素，或者存储100万个元素，在元素查询/检索方面，效率是相同的，
*               因为数组中元素查找的时候不会一个一个找，是通过数学表达式计算出来的。
*
*       缺点:
*               第一:由于为了保证数组中每个元素的内存地址连续，所以在数组上随机删除或者增加元
*                   素的时候，效率较低，因为随机增删元素会涉及到后面元素统一向前或者向后位移
*                   的操作。
*               第二:数组不能存储大数据量，为什么?
*                   因为很难在内存空间上找到一块特别大的连续的内存空间。
*
*   14.怎么声明\定义一个一维数组？
*       int[] array1;
*       double[] array2;
*       boolean[] array3;
*       String[] array4;
*       Object[] array5;
*
*   15.怎么初始化一个一维数组？
*       静态初始化：
*           int[] array1 = new int{100,5,1,4}
*       动态初始化：
*           String[] array2 = new [5];  //5为数组长度，即length。
*
* */
public class ArrayTeat01 {
    public static void main(String[] args) {
        System.out.println(args.length);
        int[] a ;
        Person[] b;
        int[] c = new int[0];
        System.out.println(c);

        String username = args[0];
        String password = args[1];

        if(username.equals("NULL") && "NULL".equals(password)){
            System.out.println("欢迎用户" + username + "回来");
            System.out.println("您可以继续使用该系统...");
        }else{
            System.out.println("用户不存在或密码错误！");
            return;
        }


    }
}

class Person{

}
