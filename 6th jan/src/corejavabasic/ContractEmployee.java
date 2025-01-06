package corejavabasic;

import classesobjects.inheritance.Employee;

public class ContractEmployee extends Employee {


    public  ContractEmployee()
    {
        //protected property empSal is visible to sub-class (child class) in
        //another package using this reference
        this.empSal = 8888;

        //default property is not visible outside package (neither to subclass nor
        //to any another class
        //this.empName = "Aaa";
    }
}
