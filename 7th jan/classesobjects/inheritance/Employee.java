package classesobjects.inheritance;

public class Employee {

    private int empId;
     String empName;
    protected double empSal;

    public Employee() {
        System.out.println("Employee zero arg/no arg constructor called");
    }


    public Employee(int empId, String empName, double empSal) {

        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;

    }

    public int getEmpId() {
        return empId;
    }



    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public String displayEmp()
    {
        return this.empId+","+this.empName+","+this.empSal;
    }


    //covariant-return type
    public Employee computeSalx()
    {
        return new Employee();
    }
    public double computeAnnSal()
    {
        System.out.println("Employee's computeAnnSal called..");
        return this.empSal*12;
    }

     double computeAnnSal(double bonus)
    {
        return this.empSal*12+bonus;
    }

}