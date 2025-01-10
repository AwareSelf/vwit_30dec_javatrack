/*
package streams;

import classesobjects.Emp;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class StreamEx {

    public static void main(String[] args) {
        Emp e1 = new Emp(5,"Nisha",10000);
        Emp e2 = new Emp(1,"Asha",20000);
        Emp e3 = new Emp(3,"Geeta",15000);
        Emp e4 = new Emp(4,"Amit",15000);
        Emp e5 = new Emp(3,"Geeta",15000);

        List<Emp> lst = new ArrayList<Emp>();
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e4);
        lst.add(e5);
        System.out.println(lst);

        //list all Employees with name starting from letter 'A'
       List<Emp> lst1 = lst.stream()
                           .filter((e)->e.getEmpName().charAt(0)=='A')
                            .collect(Collectors.toList());
        System.out.println(lst1);


        //List all Employees with salary greater tha 5000

        Predicate<Emp> p = (e)->e.getEmpSal()>5000;

        boolean r = p.test(e1);
        System.out.println(r);

        lst.stream().filter(p).collect(Collectors.toList());


        List<Emp> lst2 = lst.stream().filter((e)->e.getEmpSal()>5000).collect(Collectors.toList());
        System.out.println(lst2);

        //To get the list of emps by incrementing their salary by 5000
         /*
         List<Emp> lst3 =   lst.stream()
                               .map((e)->{
                                           double s = e.getEmpSal();
                                             s+=5000;
                                             e.setEmpSal(s);
                                            return e;
                                          })
                               .collect(Collectors.toList());
       */
/*
        List<Emp> lst3 =   lst.stream().map(e->{  e.setEmpSal(e.getEmpSal()+5000); return e; }).collect(Collectors.toList());
        System.out.println(lst3);

        //give bonus of 5000 to emp whose deptno is 10
       //increment salaries of emp by 500o whose name start with letter 'A'

        List<Emp> lst4 = lst.stream()
                            .filter(e->e.getEmpName().charAt(0)=='A')
                            .map(e->{
                                       e.setEmpSal(e.getEmpSal()+5000);
                                         return e;
                                    })
                            .collect(Collectors.toList());

        //befor- lst.size() - 5
        //get emps by eliminating the duplicate
        //after - convert to set - 4

        Emp[] arr = new Emp[3];
        arr[0] =  new Emp();

        //find out no of emps in the array arr
        System.out.println(arr.length); //this is incorrect
        //get count of Emp instances in the Emp array arr
        long ct = Arrays.stream(arr).filter(e->e!=null).count();
        System.out.println(ct);

        List<Emp> lstemp = new ArrayList<>();
        Emp e11= new Emp();
        lstemp.add(e11);
        Emp e21=null;
        Emp e31=null;
        lstemp.add(e21);
        lstemp.add(e31);

        System.out.println(lstemp.size()); //incorrect count of emp objects
        System.out.println(lstemp.stream().filter(e->e!=null).count());


    }
}
*/
