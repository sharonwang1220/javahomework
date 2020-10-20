package homework_Oct20;

import java.util.Scanner;

public class C7T10 {
    public static void main(String[] args) {
        double[] array = new double[10];
        System.out.println("请输入十个数字");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();

        }
        indexOfSmallestElement(array);
    }
    public static void indexOfSmallestElement(double[] array) {
        int j=0;
        double  min=array[0];
        for(int i=0;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
                j=i;
            }
        }
        System.out.println("数组中最小的元素的下标是："+j);
    }
}
