package classesobjects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


       // System.out.println(Emp.empCt); //0
        //e1 is Object/instance reference
        Emp e1; //e1 is local ref
        e1 = new Emp(); //16 bytes //e1=2000
        System.out.println(e1.hashCode());
        System.out.println(Emp.empCt); //1
        System.out.println(e1.empId); // 2000 -> 4 bytes -> val

        Object o  =  e1; // Emp e1 is-a Object  // super = sub

        Emp x = (Emp)o; // subtype = (explicit cast) supertype


        Emp e2 = new Emp();//e2 = 3000
        System.out.println(e2.hashCode());
        System.out.println(e2.empId);// 3000-> 4 byte -> val
        System.out.println(Emp.empCt); //2

        Emp e3 = new Emp();//e3 = 4000
        System.out.println(e3.empId);// 4000-> 4 byte -> val
        System.out.println(Emp.empCt); //3
        int no; //local variable
        String str;
        Main ob;
        Emp e;

        //memory allocation - local variable,class variable,object/instance variable
        // datatypes
    }
}