package homework_Oct20;

import java.util.Scanner;

public class C8T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请确定方阵的行（列）数n：");
        int n = scanner.nextInt();
        System.out.println("请输入一个n*n的矩阵");
        double[][] array = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("主对角线的和为：");
        System.out.println(sumMajorDiagonal(array));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}