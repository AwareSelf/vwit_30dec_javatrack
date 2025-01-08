package collectionsapi;

import classesobjects.inheritance.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Ram",5000,20);
        Employee e2 = new Employee(2,"Shyam",6000,20);

        List<Employee> lst = new ArrayList<>();
        lst.add(e1);
        lst.add(e2);
        lst.add(new Employee(3,"Guddu",6000,10));
        lst.add(new Employee(1,"Ram",5000,20));

        System.out.println(lst); //lst.toString()
        System.out.println(lst.size());
        System.out.println(lst.get(1));

        Employee ex = new Employee(3,"Guddu",6000,10);
        System.out.println(lst.contains(ex));//it checks if element is present but doesnt remove
        System.out.println(lst.size());
        System.out.println(lst.remove(ex)); //remove element based on element
        System.out.println(lst.size());
        System.out.println(lst);
        lst.remove(0);//remove element based on index pos

        System.out.println("list befor calling set:"+lst);
        lst.set(1,new Employee(11,"Arjun",56000,10));
        System.out.println(lst);

        System.out.println(lst.get(1));

    }
}
