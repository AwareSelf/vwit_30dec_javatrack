package classesobjects.inheritance;

public class Employee implements Comparable<Employee>{

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

    //e1,e2,e3    (e1.compareTo(e2))- +ve return-value means e1>e2 -> swap e1 and e2
    //e2,e1,e3,e4 (e1.compareTo(e3) - +ve return-value means e1>e3, swap e1 and e3
    //e1,e3,e1,e4  (e1.compareTo(e4) - -ve return-value means e1<e4 - not swap e1 and e4
    //bubble sort all elements linearly and use above way for comparison
    //if duplication then this.empId-o.empId will return 0, so it will
    // replace old value with its duplicate so there will be only one value
    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }
}