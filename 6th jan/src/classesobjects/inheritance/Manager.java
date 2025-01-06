package classesobjects.inheritance;

public class Manager extends Employee{
     private int teamSize;
     private String mgrType;
     private double commission;

    public Manager()
    {
      //  super(); //this line is added by compiler
        System.out.println("Manager zero arg constructor called..");

    }

    public Manager(int empId,String empName,double empSal,int teamSize,String mgrType,double commission)
    {
        super(empId,empName,empSal);
       this.empSal = 888;
       this.empName = "aaa";
       this.teamSize = teamSize;
       this.mgrType = mgrType;
       this.commission = commission;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getMgrType() {
        return mgrType;
    }

    public void setMgrType(String mgrType) {
        this.mgrType = mgrType;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void delegate()
    {

        System.out.println("Manager:"+this.getEmpName()+
                " is delegating to his team of size:"+this.teamSize);
    }

    //Manager teturn type is covariant-return type of overriden method
    @Override
    public Manager computeSalx()
    {
        return new Manager();
    }


    @Override
    public double computeAnnSal()
    {
        System.out.println("Manager's computeAnnSal called..");
       return super.computeAnnSal() + this.commission;
    }
}
