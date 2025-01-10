package classesobjects.containment;

public class ContainmentEx {
    public static void main(String[] args) {
        Dept d1 = new Dept(10,"HR",10,"Mumbai");
        Employee e1 = new Employee(1,"Ram",50000,d1);
        Employee e2 = new Employee(11,"Radha",80000,d1);


        Dept d2 = new Dept(20,"Accounts",20,"Mumbai");
        Employee e3 = new Employee(2,"Shyam",50000,d2);
        Employee e4 = new Employee(10,"Mohan",80000,d2);

        System.out.println("query:show me the departmt details of employee e3");
        System.out.println(e3.getDept());
        //e1 ke department mein kitne bande hain?
        System.out.println("requirement:get me the head count of the department of employee e1");
        System.out.println(e1.getDept().getDeptCount());

        //what is location e1's department
        System.out.println(e1.getDept().getDeptLoc());



    }
}
