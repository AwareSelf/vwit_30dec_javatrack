package classesobjects.equalstostringex;

import classesobjects.inheritance.Account;
import classesobjects.inheritance.Employee;

public class EqualsEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Ram",5000,20);
        Employee e2 = new Employee(1,"Ram",5000,20);

        System.out.println(e1==e2); //false

        //Object.equals() works same as ==
        System.out.println(e1.equals(e2)); //true //check if they are meaningfully equal

        //create two account objects with same account id and check if
        //they are memory-wise equal and if they are meaning-fully equal

        Account ac1 = new Account(1,"namrata",6000);
        Account ac2 = new Account(1,"namrata",6000);
        System.out.println(ac1==ac2);

        System.out.println(ac1.equals(ac2));


        ac1 = ac2; //memory-wise same
        System.out.println(ac1.equals(ac2));


    }
}
