package classesobjects.inheritance;

import classesobjects.Account;
import classesobjects.myclasses.Car;

public class UseEmployee {

    public static void main(String[] args) {

        int id = 1;
        //Employee ref --> Employee Object
        Employee e = new Employee(id,"Ram",5000);
        e.empSal =9000;
        e.empName = "AAA";
        System.out.println(e.displayEmp());
        System.out.println("emp e1 ann sal:"+e.computeAnnSal());
        Employee e2 = new Employee(2,"Shyam",6000);
        System.out.println(e2.displayEmp());

        String empdet = e2.displayEmp();
        System.out.println(empdet);
        double totsal = e2.computeAnnSal(5000);//
        System.out.println("emp e2:"+e2.getEmpName()+" has annual salary:"+totsal);

        //System.out.println(e2.meth());


        //e2.displayEmp();

        Account acct;
        Car c;

    }
}
