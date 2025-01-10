package streams1;

import classesobjects.inheritance.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;

public class StreamEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Abhi",5000,20);
        Employee e2 = new Employee(2,"Shyam",6000,20);

        List<Employee> lst = new ArrayList<>();

        lst.add(e1);
        lst.add(e2);
        lst.add(new Employee(3,"Ankush",6000,10));
        lst.add(new Employee(4,"Aarti",5000,20));
        lst.add(new Employee(5,"Rakhi",5000,20));

        System.out.println(lst); //lst.toString()

        //find out emp count of dept 10 employees
        long tot = lst.stream().filter(e->e.getDeptno()==10).count();
        System.out.println("no of emps of deptno 10="+tot);


        //find out total salary of all emps
        double totsal =  lst.stream().mapToDouble(e->e.getEmpSal()).sum();
        System.out.println("total sal of all emps:"+totsal);

        //find out total salary of all emps of dept 10
        totsal =  lst.stream().filter(e->e.getDeptno()==10)
                                     .mapToDouble(e->e.getEmpSal())
                                     .sum();
        System.out.println("total sal of all emps of dept 10:"+totsal);

        //traditional structural programming way of doing it
        List<Employee> newlst =   meth1(lst);
        System.out.println(newlst);

        //list/display the emp whose sal is greater than 10000
        //also get me the new list containing only the emps whose sal greater than 10000
      List<Employee> newlst1 =   meth(lst);
        System.out.println(newlst);

        //functional programming style of doing it
    List<Employee> newlst2 = lst.stream().filter(e->e.getEmpSal()>5000)
                                         .collect(Collectors.toList());
        System.out.println(newlst2);


        System.out.println(lst);
        //show me the list of employees whose name starts with letter 'A'
        List<Employee> lstx = lst.stream()
                                 .filter(e->e.getEmpName().charAt(0)=='A')
                                  .collect(Collectors.toList());
        System.out.println(lstx);


        List<Integer> intlst = Arrays.asList(1,14,10,7,9,19,10); //asList accepts var-arg
        //get me set of all even nos;
         Set<Integer> st = intlst.stream().filter(no->no%2==0).collect(Collectors.toSet());
        System.out.println(st);

        System.out.println("ncrement the sal of emps by 5000 using streams api");
        //increment the sal of emps by 5000
        System.out.println(lst);
        /*
        Function<Employee,Employee> f = (e)->{
                                                e.setEmpSal(e.getEmpSal()+5000);
                                                return e;
                                              };
        lst = lst.stream().map(f).collect(Collectors.toList());
        */
        double bonus = 5000;
        lst = lst.stream()
                .map(e->{e.setEmpSal(e.getEmpSal()+bonus); return e;})
                .collect(Collectors.toList());
        System.out.println(lst);

        //emp dept 10 with  bonus added to their slaries
       List<Employee> empdep10lst= lst.stream()
                  .filter(e->e.getDeptno()==10)
                  .map(e->{e.setEmpSal(e.getEmpSal()+5000); return e;})
                .collect(Collectors.toList());

        System.out.println(empdep10lst);

        /*
        in case you want to have the original list will only deptno 10 emps modified
        in it
         then do as below:

        //from original list - get all emps not of dept no 10
     List<Employee> empnotdep10 =  lst.stream().
                                       filter(e->e.getDeptno()!=10)
                                       .collect(Collectors.toList());

          empnotdep10.addAll(empdep10lst); //merge both
        System.out.println(empnotdep10); //original list with modified element
        */





    }

    public static List<Employee> meth(List<Employee> lst)
    {
        /*
        Stream<Employee> strm = lst.stream();
       Predicate<Employee> p =  e->e.getEmpSal()>5000;
       strm = strm.filter(p);
       List<Employee> newlst = strm.collect(Collectors.toList());
         return newlst;
           */

       return lst.stream().filter(e->e.getEmpSal()>5000).collect(Collectors.toList());

    }

    //list/display the emp whose sal is greater than 10000
    //also get me the new list containing only the emps whose sal greater than 10000
    //traditional way without using Stream
    public static List<Employee> meth1(List<Employee> lst)
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
