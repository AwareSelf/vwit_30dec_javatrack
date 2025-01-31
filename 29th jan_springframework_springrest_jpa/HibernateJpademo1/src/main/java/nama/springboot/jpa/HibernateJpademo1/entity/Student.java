package nama.springboot.jpa.HibernateJpademo1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Stud")
public class Student {

    @Id
    @GeneratedValue
    Long studid;

    @Column(name="studname")
    String name;


    int totalMarks;

    //default fetch type strategy for any relation is FetchType.EAGER
    @OneToOne
    @JoinColumn(name = "p_id")
    Passport empPass;

    public Student() {
    }

    public Student(String name, int totalMarks) {

        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Student(String name, int totalMarks, Passport empPass) {
        this.name = name;
        this.totalMarks=totalMarks;
        this.empPass = empPass;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudid() {
        return studid;
    }

    public void setStudid(Long studid) {
        this.studid = studid;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Passport getEmpPass() {
        return empPass;
    }

    public void setEmpPass(Passport empPass) {
        this.empPass = empPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studid=" + studid +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", empPass=" + empPass +
                '}';
    }
}
