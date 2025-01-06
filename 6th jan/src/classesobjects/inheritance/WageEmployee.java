package classesobjects.inheritance;

public class WageEmployee extends Employee {

    private double dailyWages;
    private int noOfDays;

    public WageEmployee(int empId, String empName, double empSal, double dailyWages, int noOfDays) {
        super(empId, empName, empSal);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }

    public double getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(double dailyWages) {
        this.dailyWages = dailyWages;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public double computeWages()
    {
        return this.dailyWages*this.noOfDays;
    }


    @Override
    public double computeAnnSal()
    {
        System.out.println("Wage Emp computeAnnSal called...");
        return super.computeAnnSal()+(this.dailyWages*this.noOfDays);
    }
}
