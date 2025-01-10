package collectionsapi;

import classesobjects.inheritance.Employee;

import java.sql.SQLOutput;
import java.util.*;

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

        System.out.println("after sorting employee list..");
         Collections.sort(lst);
        System.out.println(lst);
      //  Collections.binarySearch(lst,new Employee(3,"Guddu",6000,10));

       // lst.add("aaa");
        List<Employee> nlst = meth(lst);
        System.out.println(nlst);
    }

    //list/display the emp whose sal is greater than 10000
    //also get me the new list containing only the emps whose sal greater than 10000
    public static List<Employee> meth(List<Employee> lst)
    {
       List<Employee> newlst = new ArrayList<>();
       Iterator<Employee> it = lst.iterator();
        while(it.hasNext())
        {
            Employee e = it.next();
            if(e.getEmpSal()>10000) {
                System.out.println(e);
                newlst.add(e);
            }
        }
        System.out.println("all emps whose sal is freater than 10000 are:"+newlst);
        return newlst;
    }
}
