package streams1;

import classesobjects.inheritance.Employee;

import java.util.Arrays;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        for(int n:arr)
        System.out.println(n);

        Employee[] emparr = new Employee[5];
        emparr[1] = new Employee(1,"Ram",5000,10);
        emparr[3] = new Employee(11,"Ram",5000,10);

        System.out.println(emparr.length);
        for(Employee e:emparr)
          System.out.println(e);

        //find out how many emps are actually there in the array
        long ct = Arrays.stream(emparr).filter(e->e!=null).count();
        System.out.println(ct);

        //curtail and remove from emp array all null elements and display it in list
        //Arrays.asList(emparray).stream() --> will convert Array-to-List-to-Stream
       List<Employee> lst  = Arrays.asList(emparr).stream().filter(e->e!=null).toList();
        System.out.println(lst);
        System.out.println(lst.size());


    }





}
