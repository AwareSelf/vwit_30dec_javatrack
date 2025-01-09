package classesobjects.equalstostringex;

import classesobjects.inheritance.Account;
import classesobjects.inheritance.Manager;

public class ToStringEx {
    public static void main(String[] args) {
        String s = "namrata";
        System.out.println(s); //s.toString();

        Account ac1 = new Account(1,"namrata",6000);
        System.out.println(ac1); //ac1.toString();

        Manager m1 = new Manager(4,"Nisha",90000,
                30,4,"Project",10000);
        System.out.println(m1);

        Manager m2 = new Manager(4,"Nisha",90000,30,
                4,"Project",10000);
        System.out.println(m1.equals(m2));
    }
}
