package array;

/*
* 关于一维数组的扩容。
*   在java开发中，数组长度一旦确定不可变，那么数组满了怎么办?
*   数组满了，需要扩容。
* java中对数组的扩容是:
*   先新建一个大容量的数组，然后将小容量数组中的数据一个一个拷贝到大数组当中。
*
* 结论:数组扩容效率较低。因为涉及到拷贝的问题。所以在以后的开发中请注意，尽可能少的进行数组的拷贝。
*       可以在创建数组对象时预估一下长度，最好预估准确，这样可以减少扩容次数，提高效率。
* */

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for(int i = 0; i <= a.length-1; i++){
            a[i] = i+1;
        }

        int[] b = new int[10];

        System.arraycopy(a,0,b,1,a.length);

        for(int i = 0; i <= b.length-1; i++){
            System.out.println(b[i]);
        }

    }
}
