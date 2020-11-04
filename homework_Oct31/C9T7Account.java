package homework_Oct31;

import java.util.Date;

public class C9T7Account {


    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        if (account.WithDraw(2500)) {
            System.out.println("成功取款!");
        } else {
            System.out.println("取款失败！");
        }
        if (account.deposit(3000)) {
            System.out.println("存款成功！");
        } else {
            System.out.println("存款失败");
        }
        System.out.println("账户余额为：" + account.getBalnace());
        System.out.println("账户月利息为：" + account.getMonthlyInterest());
        System.out.println("账户的开户日期为：" + account.getDate());
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //无参构造方法
    public Account() {
        Date dateCreated = new Date();
    }

    //指定id和初始余额的构造方法
    public Account(int ID, double Balance) {
        Date dateCreated = new Date();
        id = ID;
        balance = Balance;
        annualInterestRate = 0.045;
    }

    //balance 的访问器
    public void setBalnace(double Balance) {
        balance = Balance;
    }

    //balance的修改器
    public double getBalnace() {
        return balance;
    }

    //AnnualInterestRate 的访问器
    public void setAnnualInterestRate(double r) {
        annualInterestRate = r;
    }

    //AnnualInterestRate的修改器
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // dateCreated的访问器
    public Date getDate() {
        return dateCreated;
    }

    //getMonthlyInterestRate方法
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }

    //getMonthlyInterest方法
    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12.0;
    }

    //WithDraw方法
    public boolean WithDraw(double money) {
        if (balance >= money) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }

    //deposit方法
    public boolean deposit(double money) {
        if (money >= 0) {
            balance += money;
            return true;
        } else {
            return false;
        }
    }
}



