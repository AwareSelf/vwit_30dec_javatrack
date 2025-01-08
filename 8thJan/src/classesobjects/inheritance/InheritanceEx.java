package classesobjects.inheritance;

public class InheritanceEx {
    public static void main(String[] args) {


        Employee ex = new Employee(1,"Ram",5000,10);
        /*
        ex.displayEmp();


        Manager m = new Manager(); //never use in real application as all prop values are zero.null
        System.out.println(m.displayEmp());


        Manager m1 = new Manager(2,"Radha",60000,4,"HR",10000);
        System.out.println(m1.displayEmp());
        System.out.println(m1.computeAnnSal());
        System.out.println(m1.getEmpName());
        System.out.println(m1.getMgrType());
        m1.delegate();
       */

       // super class ref ---pointing to---> subclass object
       // Manager is-a Employee, so Manager object can be assigned Employee reference
        Employee e2 = new Manager(5,"Rahul",65000,20,
                10,"HR",10000);

        System.out.println(e2.computeAnnSal());

        //sub-class ref can't point to super-class object
        //Manager mx  =ex;  //Employee (super type) can't be assined to Manager (sub-type)_

        /*
        WageEmployee we = new WageEmployee(3,"Geeta",3000,100,20);
        System.out.println("daily wages of wage emp "+we.getEmpName()
                            +"is :"+we.computeWages());




        meth(new Manager(3,"Naina",80000,4,
                "Accounts",10000));
        */
        Manager m2 = new Manager(4,"Nisha",90000,10,4,
                "Project",10000);
        meth1(m2);

        meth1(new WageEmployee(9,"Meeta",4000,10,200,20));

        meth1(ex);
      //  Employee x = m2;


    }


    /*
    static void meth(Manager m1)
    {
       m1.delegate();
    }
    */


    static void meth1(Employee e)
    {
        System.out.println(e.computeAnnSal());

       if(e instanceof Manager)
            ((Manager)e).delegate();
        if(e instanceof WageEmployee)
            System.out.println("daily wages of WageEmp:"+
                    ((WageEmployee)e).computeWages());
    }
}
