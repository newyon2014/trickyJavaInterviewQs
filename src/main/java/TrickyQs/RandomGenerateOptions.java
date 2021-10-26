package TrickyQs;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerateOptions {

    public static void main(String[] args) {
        //1. Random Class

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt());
            System.out.println(random.nextDouble());
            System.out.println(random.nextFloat());
        }

        //2. random() from Math
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }

        //3. ThreadLocalRandom ()
        for (int i = 0; i < 5; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt());
            System.out.println(ThreadLocalRandom.current().nextDouble());
            System.out.println(ThreadLocalRandom.current().nextFloat());
            System.out.println(ThreadLocalRandom.current().nextBoolean());
        }

        //4. Generate specific range of numbers
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(20)); // Between 0 to 20
            System.out.println(ThreadLocalRandom.current().nextInt(0, 20)); // Between 0 to 20
        }
    }
}
