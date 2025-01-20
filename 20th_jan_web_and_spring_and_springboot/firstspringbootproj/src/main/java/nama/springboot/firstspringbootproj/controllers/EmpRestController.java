package nama.springboot.firstspringbootproj.controllers;


import nama.springboot.firstspringbootproj.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="employee")
public class EmpRestController {
    List<Employee> lst;

    /*
    {
    "empNo": 1,
    "empName": "Ram",
    "empSal": 3000.0
    }
     */

    public EmpRestController()
    {
        System.out.println("zero arg constructor of emp");
        lst = new ArrayList<>();
        lst.add(new Employee(1,"Ram",5000));
        lst.add(new Employee(11,"Shyam",6000));

    }
    @GetMapping("emp")
    public Employee getemp()
    {
        return new Employee(1,"Ram",3000);
    }

    //new emp posted and added to list
    @PostMapping("emp")
    public Employee postemp(@RequestBody Employee e)
    {
        System.out.println(e.getEmpNo()+","+e.getEmpName()+" is posted");
        lst.add(e);
        return e;
    }

    //for new emp-post the emp by incrm sal by bonus
    @PostMapping("emp/bonus/{bonus}")
    public Employee postemp(@RequestBody Employee e,@PathVariable double bonus)
    {
        System.out.println(e.getEmpNo()+","+e.getEmpName()+" is posted");
       e.setEmpSal(e.getEmpSal()+bonus);
       lst.add(e);
        return e;
    }

    //incrm bonus for existing emp
    @GetMapping("emp/incrbonus/{empid}/{bonus}")
    public Employee inceSal(@PathVariable int empid,@PathVariable double bonus)
    {
        Employee ex = lst.stream().filter(e->e.getEmpNo()==empid).findFirst().get();
        ex.setEmpSal(ex.getEmpSal()+bonus);
        return ex;
    }


}
