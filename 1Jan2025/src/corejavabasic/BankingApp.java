package corejavabasic;

import classesobjects.*;
import classesobjects.myclasses.Car;


public class BankingApp {

    Account act;
    Emp e;
    UseEmployee u;
    Car c;

    public static void main(String[] args) {
        Account act = new Account(2,"aaa",6000);
        BankingApp app = new BankingApp(act,8);

        app = new BankingApp();

    }

    public BankingApp(Account ob1,int n)
    {

    }
    public BankingApp()
    {

    }

    public BankingApp(int n1,Account acc)
    {

    }

}
