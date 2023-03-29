package array;
/*
*关于Java中的二维数组：
*   1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
*
*   2、三维数组是什么?
*       三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组。
*       实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
*
*   3、二维数组静态初始化
*       int[][] array = {1,1,1,1},{2,3,4,5},{0,0,0,0]};
* */
public class ArrayTest04 {
    public static void main(String[] args) {
//        一维数组
        int[] a = {100,200,300};
//        二维数组
        int[][] b = {
                {1,2,3,4,5},
                {0,2},
                {100,11,43,2,4,2},
                {7,2,1,2}
        };

        for (int i = 0; i < b.length; i++) {
            System.out.print("{");
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
                if(j == b[i].length-1){
                    System.out.println("}");
                }else{
                    System.out.print(",");
                }
            }

        }

        System.out.println(b.length);

        int[][] dd = new int[5][];
        int[][][][][] ddddd = new int[6][][][][];

        System.out.println(ddddd.length);

    }
}
