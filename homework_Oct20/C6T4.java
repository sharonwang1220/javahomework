package homework_Oct20;

import java.util.Scanner;

public class C6T4 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        int sum = 0;
        while (number != 0) {
            int d = number % 10;
            sum = sum * 10 + d;
            number = number / 10;
        }
        System.out.println("反序数为：");
        System.out.println(sum);
    }
}
