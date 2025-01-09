package corejavabasic;

import classesobjects.inheritance.Employee;

public class EmployeeApp {

    public  EmployeeApp()
    {
        Employee ob = new Employee();
        //protected property/member empSal is not accessible to non-derived class
        //in another package
        //ob.empSal = 880;
    }
}
