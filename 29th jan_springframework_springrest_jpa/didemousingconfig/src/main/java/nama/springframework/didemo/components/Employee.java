package nama.springframework.didemo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Objects;


public class Employee {


    private int empId;

    private String empName;
    private double empSal;
    private Account empAcct;

    public Employee() {
    }

    public Employee(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Employee(int empId, String empName, double empSal, Account empAcct) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.empAcct = empAcct;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public Account getEmpAcct() {
        return empAcct;
    }


    public void setEmpAcct(Account empAcct) {
        this.empAcct = empAcct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpId() == employee.getEmpId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                ", empAcct=" + empAcct +
                '}';
    }
}
