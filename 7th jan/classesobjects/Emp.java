package classesobjects;

import java.time.LocalTime;

public class Emp {
    //attributes/properties/member variable/instance or object variables
    int empId;
    String empName;
    double empSal;

    //class variable
    static int empCt; //scope of static variable is bound to its enclosing class

    static {

        empCt = 0;
        System.out.println("static block 1:"+empCt);
    }

    static {

        System.out.println("static block 2:"+empCt);
    }

    public Emp()
    {
        System.out.println("default no arg Emp constructor called ");
        empCt++;
        this.empId = empCt;

    }

    public Emp(int id,String name,double sal)
    {

    }


    //member functions/member methods/instance or object methods
    public double calcAnnSal()
    {

      return this.empSal*12;
    }
    public void login()
    {
        calcAnnSal();
        System.out.println("Emp:"+this.empId+" logged in:time:"+LocalTime.now());
    }
}//end of Emp class

class UseEmp {


    public static void main(String[] args) {
        Emp e = new Emp();
        e.calcAnnSal();
    }
    void createEmp()
    {
      /*
        System.out.println(Emp.empCt);

        Emp.empCt = 6;
        System.out.println(Emp.empCt);
        */

    }

}
