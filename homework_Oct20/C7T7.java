package homework_Oct20;

import java.util.Random;

public class C7T7 {
    public static void main(String[] args) {
        int[] number = new int[100];
        int[] count = new int[10];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            number[i] = random.nextInt(10);

            for (int j = 0; j < 10; j++) {
                if (number[i] == j) {
                    count[j]++;
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("数字" + j + "出现的次数是：" + count[j]);
        }
    }

}



