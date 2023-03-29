package day002;

public class ThisTest {
    public static void main(String[] args) {
        int i,a,b;
        a=b=0;
        a++;
        for(i=0;i<2;i++){
            System.out.println(a++);
        }

        for(i=0;i<2;++i){
            System.out.println(++b);
        }


    }
}
