package classesobjects;

public class UseEmployee {

    public static void main(String[] args) {

        int id = 1;
        //Employee ref --> Employee Object
        Employee e = new Employee(id,"Ram",5000);
        System.out.println(e.displayEmp());
        System.out.println("emp e1 ann sal:"+e.computeAnnSal());
        Employee e2 = new Employee(2,"Shyam",6000);
        System.out.println(e2.displayEmp());

        String empdet = e2.displayEmp();
        System.out.println(empdet);
        double totsal = e2.computeAnnSal();
        System.out.println("emp e2:"+e2.empName+" has annual salary:"+totsal);

        //System.out.println(e2.meth());


        //e2.displayEmp();

    }
}
