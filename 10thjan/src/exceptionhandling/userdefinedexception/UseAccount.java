package exceptionhandling.userdefinedexception;

import java.util.Scanner;

public class UseAccount {
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
       String yesno = "no";
        do {

            System.out.println("Enter amt to withdraw:");
            double amt = sc.nextDouble();
            try {
                ob.withdraw(amt);
            }
            catch(InsufficientBalanceException e)
            {
                System.out.println(e.getMessage());
                break;
            }

            System.out.println("amt u asked to withdraw:" + amt + " bal is:" + ob.getAcctBal());
            System.out.println("do u wish to continue:(y/Y)");
            yesno = sc.next();
        }while(yesno.charAt(0)=='y'||yesno.charAt(0)=='Y');
    }
}
