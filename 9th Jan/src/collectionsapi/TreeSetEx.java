package collectionsapi;

import classesobjects.inheritance.Employee;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        SortedSet<String> st = new TreeSet<>();
        st.add("namrata");
        st.add("niraj");
        st.add("arjun");
        st.add("brijesh");
        System.out.println(st);

        SortedSet<Integer>  ts = new TreeSet<>();
        int no = 10,no1=1;
        ts.add(no);  // ts.add(new Integer(no)); //auto-boxing
        ts.add(no1);
        ts.add(5);
        ts.add(3);
        System.out.println(ts);

       // int x = ts.first().intValue();
       /* Integer t = ts.first();
        int x = t.intValue(); */
        int x = ts.first();  //auto-unboxing

        Employee e1 = new Employee(11,"Ram",5000,20);
        Employee e2 = new Employee(3,"Shyam",6000,20);

        Employee e3 = new Employee(2,"Shyam",6000,10);

        SortedSet<Employee> st1 = new TreeSet<>();
        st1.add(e1);
        st1.add(e2);
        st1.add(e3);
        st1.add(new Employee(11,"Ram",5000,20));
        System.out.println(st1);

    }
}
