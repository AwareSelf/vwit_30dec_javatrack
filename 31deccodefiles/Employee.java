public class Employee {

    int empId;
    String empName;
    double empSal;

    Employee()
    {
        System.out.println("Employee zero arg/no arg constructor called");
    }


    Employee(int id,String name,double sal)
    {
        this.empId = id;
        this.empName = name;
        this.empSal = sal;

    }



}
