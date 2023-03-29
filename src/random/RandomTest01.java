package random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt();
        System.out.println(num1);

        int num2 = random.nextInt(2);
        System.out.println(num2);

    }
}
