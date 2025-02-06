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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "p_id")
    Passport studPass;

    public Student() {
    }

    public Student(String name, int totalMarks) {

        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Student(String name, int totalMarks, Passport studPass) {
        this.name = name;
        this.totalMarks=totalMarks;
        this.studPass = studPass;
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

    public Passport getStudPass() {
        return studPass;
    }

    public void setStudPass(Passport studPass) {
        this.studPass = studPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studid=" + studid +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", student Pass=" + studPass +
                '}';
    }
}
