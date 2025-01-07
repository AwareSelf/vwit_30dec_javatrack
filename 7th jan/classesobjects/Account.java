package classesobjects;

public class Account {
    private int acctId;
    private String acctName;
     private double acctBal;


     public Account(int acctId,String acctName,double acctBal)
     {
        /* System.out.println("inside constructor:"+this.acctId+","+this.acctBal
         +","+this.acctName);
         */
         if(acctId > 0)
            this.acctId = acctId;
         else
         {
             System.out.println("acctId cant be -ve or zero");
         }

         this.acctName = acctName;

         if(acctBal>0)
          this.acctBal = acctBal;
         else {
             this.acctBal = 100;
             System.out.println("Acct bal can't be zero or -ve,setting it to min 100");
         }
     }

    public int getAcctId() {
        return acctId;
    }


    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public double getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(double acctBal) {
         if(acctBal > 0) {
             this.acctBal = acctBal;
         }
         else
         {
             System.out.println("acct bal can't be zero or -ve");
         }
    }


    void withdraw(double amt)
    {
        if(amt <= this.acctBal)
        {
            this.acctBal = this.acctBal - amt;

        }
        else
        {
            System.out.println("Insufficient balance:"+this.acctBal);

        }
    }

    double deposit(double amt)
    {
        this.acctBal += amt; //this.acctBal = this.acctBal + amt
        System.out.println("amt deposited:"+amt+",bal="+this.acctBal);
        return amt;

    }

    String displayAcct()
    {
        return this.acctId+","+this.acctName+","+this.acctBal;
    }


}
