package homework_Oct31;

import java.util.*;

public class C13T3ArrayListSort {

    public static void sort(ArrayList<Number> list) {
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if ((int) o1 < (int) o2) return 1;
                else if ((int) o1 == (int) o2) return 0;
                else return -1;
            }
        };
        List list01 = new ArrayList(list);
        Collections.sort(list01);
        list01.sort(c);
        System.out.println("排序后的数字为：" + list01);
    }

    //定义最长长度
    static int ARRAY_MAX = 20;

    public static void main(String[] args) {
        System.out.println("请输入数量不多于20的一组数字，输入0结束输入：");
        ArrayList<Number> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ARRAY_MAX; i++) {
            int n = sc.nextInt();
            //输入0结束输入
            if (n != 0) {
                list.add(n);
            } else {
                break;
            }
        }
        System.out.println("输入的数字为：" + list);
        sort(list);


    }
}
