package homework_Oct20;

import java.util.Random;
import java.util.Scanner;

public class C6T17 {
    public static void main(String[] args) {
        System.out.println("请输入矩阵的行数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("输出到矩阵为：");
        printMartix(n);
    }

    public static void printMartix(int n) {
        int count = 0;
        while (count < n * n) {
            Random random = new Random();
            int number = random.nextInt(2);
            count++;
            if (count % n != 0) {
                System.out.print(number+" ");
            } else {
                System.out.print(number + "\n");
            }
        }

    }
}
