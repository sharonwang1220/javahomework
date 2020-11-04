package homework_Oct31;

import java.util.Date;

public class C9T3 {
    public static void Date(long n) {
        Date date = new Date(n);
        System.out.println(date.toString());
    }
//10000000000超过int的范围，需要用long 数字后加L
    public static void main(String[] args) {
        Date(10000L);
        Date(100000L);
        Date(1000000L);
        Date(10000000L);
        Date(100000000L);
        Date(1000000000L);
        Date(10000000000L);
    }
}
