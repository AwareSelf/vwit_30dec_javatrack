package classesobjects.inheritance;

public class Employee {

    private int empId;
     String empName;
    protected double empSal;
    private int deptno;

    public Employee() {
        System.out.println("Employee zero arg/no arg constructor called");
    }


    public Employee(int empId, String empName, double empSal,int deptno) {

        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.deptno = deptno;

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

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
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


    @Override
    public boolean equals(Object obj)  //Object obj = e2
    {
        System.out.println("overriden equals method of Employee called...");
        if(obj instanceof  Employee)
          return this.empId == ((Employee)obj).empId;
        else
            return false;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ". deptno="+deptno+
                '}';
    }

    @Override
    public int hashCode()
    {
        System.out.println("hashCode method of emp called:hasCode="+this.deptno);
        return this.deptno;
    }
}