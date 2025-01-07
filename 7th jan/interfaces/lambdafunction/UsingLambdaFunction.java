package interfaces.lambdafunction;

import interfaces.Bounceable;

public class UsingLambdaFunction {
    public static void main(String[] args) {

       //Lambda function programming style can be used to implement
        //interface with only one abstract method.Such an interface is also
        //called as Functional Interface
        //so functional interface is an interface with only one abstract method

        /*
        Addable ref = (double no1,double no2)-> {
                                                   double r = no1 + no2;
                                                    return r;
                                                };

          */
        //impl1 of Addable functional interface
        Addable ref = (no1,no2)->no1+no2;
        double r = ref.add(10.5,10.5);
        System.out.println(r);
        System.out.println(ref.add(5.5,6.5));

        //impl2 of Addable functional interface
        ref = (q1,q2)->3*(q1+q2);
        System.out.println(ref.add(2.0,3.0));

        //call same impl2 of Addable function by passing it to meth() method
        r =  meth(ref,3.1,3.1);
        System.out.println(r);

        System.out.println(meth((n1,n2)->n1+n2,5.2,3.5));

        //impl3 of Addable , passed to meth() method
        r = meth((a,b)->(a*a)+(b*b),5,6);
        System.out.println(r);

        //impl4 of Addable, passed to meth() method
        r = meth((a,b)->(2*a)+(2*b),5,6);
        System.out.println(r);

    }

    public static double meth(Addable a,double n1,double n2)
    {
        return a.add(n1,n2);
    }
}
