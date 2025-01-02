package classesobjects;

public class Employee {

    int empId;
    String empName;
    double empSal;

    Employee() {
        System.out.println("Employee zero arg/no arg constructor called");
    }


    Employee(int empId, String empName, double empSal) {

        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;

    }

    public String displayEmp()
    {
        return this.empId+","+this.empName+","+this.empSal;
    }

    public double computeAnnSal()
    {
        return this.empSal*12;
    }

    public double computeAnnSal(double bonus)
    {
        return this.empSal*12+bonus;
    }

}