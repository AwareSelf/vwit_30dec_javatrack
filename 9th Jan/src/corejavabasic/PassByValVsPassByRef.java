package corejavabasic;

public class PassByValVsPassByRef {

    public static void main(String[] args) {

        int n1=5,n2=7;
        System.out.println("before call:n1="+n1);
        n1 = add(n1,n2);
         System.out.println("after call:n1="+n1); //n1 of main

        Add ob = new Add(n1,n2);
        System.out.println(ob.no1+","+ob.no2);
        ob.add(); //no need to return and collect back the value as its pass/func-call by address
        System.out.println(ob.no1+","+ob.no2);


    }

    //pass by value (if u dont return/copy back changes then they will lost
    //add func n1 and main func n1 are two separate memory loctns/address
    public static int add(int n1,int n2)
    {
         n1 = n1 + n2; //n1 of add func
        System.out.println("n1="+n1);
        return n1;
    }


}


class Add
{
    int no1,no2;

    Add()
    {
        this.no1=10;
        this.no2=20;
    }

    Add(int n1,int n2)
    {
        this.no1 = n1;
        this.no2 = n2;
    }

    //pass by address //this refers to same object-ref address,
    // so they modify same original copy
    void add()
    {
        this.no1 = this.no1+this.no2;
    }
}
