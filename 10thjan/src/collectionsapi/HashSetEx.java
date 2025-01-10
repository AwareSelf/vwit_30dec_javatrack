package collectionsapi;

import classesobjects.inheritance.Employee;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {


        Employee e1 = new Employee(1,"Ram",5000,20);
        Employee e2 = new Employee(2,"Shyam",6000,20);

        Employee e3 = new Employee(3,"Shyam",6000,10);

        Set<Employee> st = new HashSet<>();
        st.add(e1);
        st.add(e2);
        st.add(e3);
        st.add(new Employee(1,"Ram",5000,20));
        System.out.println(st);
        System.out.println(st.size());


    }
}
