package nama.springboot.firstspringbootproj.model;

import java.util.Objects;

public class Employee {
    private int empNo;
    private String empName;
    private double empSal;

    public Employee() {
        System.out.println("Employee 0-arg constructor called");
    }

    public Employee(int empNo, String empName, double empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpNo() == employee.getEmpNo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEmpNo());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
