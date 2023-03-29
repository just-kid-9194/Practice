package integer;
/*
* String int Integer之间互相转换
* */
public class String_int_Inreger互转 {
    public static void main(String[] args) {
        //String --> int
        int i1 = Integer.parseInt("123");

        //int --> String
        String is1 = 12 + "";//字符串拼接
        String is2 = String.valueOf(12);

        //int --> Integer
        Integer in1 = new Integer(12);
        Integer in2 = 123;
        Integer in3 = Integer.valueOf(123);

        //Integer --> int
        int ii1 = in1;
        int ii2 = in2.intValue();

        //String --> Integer
        Integer si1 = new Integer("123");
        Integer si2 = Integer.valueOf("123");

        //Integer --> String
        String is = String.valueOf(si1);
    }
}
