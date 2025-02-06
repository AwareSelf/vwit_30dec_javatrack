package nama.springboot.jpa.HibernateJpademo1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Emp")
public class Employee {

    @Id
    @GeneratedValue
    Long id;

    @Column(name="empname")
    String name;

    double salary;

    //default fetch type strategy for any relation is FetchType.EAGER
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_id")
    Passport empPass;

    public Employee() {
    }

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, Passport empPass) {
        this.name = name;
        this.salary = salary;
        this.empPass = empPass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Passport getEmpPass() {
        return empPass;
    }

    public void setEmpPass(Passport empPass) {
        this.empPass = empPass;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", empPass=" + empPass +
                '}';
    }
}
