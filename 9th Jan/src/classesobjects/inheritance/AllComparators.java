package classesobjects.inheritance;

import java.util.Comparator;

public class AllComparators {

   public static Comparator<Employee> empNameComparator = (ex, ey)->{
        return ex.getEmpName().compareTo(ey.getEmpName());
    };

    public static Comparator<Employee> empSalDescComparator = (ex, ey)->{
        return (int)(ey.empSal-ex.empSal);
    };
}
