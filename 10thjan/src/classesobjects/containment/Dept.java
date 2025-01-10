package classesobjects.containment;

import java.util.Objects;

public class Dept {
    private int deptno;
    private String deptName;
    private int deptCount;
    private String deptLoc;

    public Dept(int deptno, String deptName, int deptCount, String deptLoc) {
        this.deptno = deptno;
        this.deptName = deptName;
        this.deptCount = deptCount;
        this.deptLoc = deptLoc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptCount() {
        return deptCount;
    }

    public void setDeptCount(int deptCount) {
        this.deptCount = deptCount;
    }

    public String getDeptLoc() {
        return deptLoc;
    }

    public void setDeptLoc(String deptLoc) {
        this.deptLoc = deptLoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dept dept)) return false;
        return getDeptno() == dept.getDeptno();
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", deptName='" + deptName + '\'' +
                ", deptCount=" + deptCount +
                ", deptLoc='" + deptLoc + '\'' +
                '}';
    }
}
