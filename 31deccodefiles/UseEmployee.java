public class UseEmployee {

    public static void main(String[] args) {
        //object reference ---> actual object (in memory)

        Employee e1;
        e1 = new Employee(); // e1=2000
        System.out.println(e1.empId);
        System.out.println(e1.empName);
        System.out.println(e1.empSal);

        Employee e2;
        e2 = new Employee(1,"Ram",50000.0); //3000
        System.out.println(e2.empId);
        System.out.println(e2.empName);
        System.out.println(e2.empSal);

        System.out.println(e1==e2);

        int no1=5,no2=5;
        System.out.println(no1==no2);

        e1 = e2;   //  copied address of e2 into e1 so that e1,e2 both share/point to same object as e2
        System.out.println(e1==e2);
        System.out.println(e1.empId);
        System.out.println(e1.empSal);

        func(e2);
        System.out.println("e2 sal:"+e2.empSal);
        System.out.println("e1 sal:"+e1.empSal);
    }

    //pass by reference/address
    static void func(Employee ex) //ex = e2
    {
        System.out.println(ex.empSal);
        ex.empSal = ex.empSal + 5000;
        System.out.println("ex sal:"+ex.empSal);
    }
}
