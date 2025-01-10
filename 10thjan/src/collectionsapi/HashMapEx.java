package collectionsapi;

import classesobjects.containment.Course;
import classesobjects.containment.Dept;
import classesobjects.containment.Student;
import classesobjects.inheritance.Employee;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {

        //adhoc relationships - are ones which are not modeled using containment in your code
       //HashMap to maintain one-to-one relationship

        Dept d1 = new Dept(10,"hr",5,"Mumbai");
        Dept d2 = new Dept(30,"projects",100,"Delhi");

        Employee e1 = new Employee(1,"Ram",5000,10);
        Employee e3 = new Employee(11,"Kirti",34000,10);

        Map<Employee,Dept> mp = new HashMap<>();
        mp.put(e1,d1);
        mp.put(new Employee(2,"Raha",50000,20),
                  new Dept(20,"Accounts",10,"Pune"));

        mp.put(e3,d1);
        mp.put(new Employee(12,"Pritesh",250000,30),d2);
        System.out.println(mp);


        System.out.println(mp.get(e1));
        System.out.println(mp.get(e1).getDeptLoc());
        System.out.println(mp.get(e3).getDeptCount());


        //show me the location of Raha's department

        //one-to-many
      //  Map<Student,List<Course>> mp = new HashMap<>();




    }
}
