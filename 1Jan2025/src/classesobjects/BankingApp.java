package classesobjects;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acctid:");
        int acctid = sc.nextInt();
        System.out.println("Enter acct balance:");
        double bal = sc.nextDouble();
        System.out.println("Enter acct holders name:");
        String name = sc.next();

        System.out.println("acctid:"+acctid+",bal:"+bal+",name:"+name);
        Account ob = new Account(acctid,name,bal);
        System.out.println(ob.displayAcct());

        System.out.println("Enter amt to withdraw:");
        double amt = sc.nextDouble();
        ob.withdraw(amt);
        System.out.println("after withdrawing amt:"+amt+" bal is:"+ob.getAcctBal());
        System.out.println("Enter amt to deposit:");
        amt = sc.nextDouble();
        System.out.println("Amt deposited:"+ob.deposit(amt));
        System.out.println(ob.getAcctBal());
    }
}
