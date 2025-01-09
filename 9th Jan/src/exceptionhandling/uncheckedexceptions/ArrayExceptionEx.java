package exceptionhandling.uncheckedexceptions;

public class ArrayExceptionEx {
    public static void main(String[] args) {
        int[] arr = {5,2,4};

        meth(arr);
        System.out.println("remaining program continnues");
    }

    static void meth(int[] arr)
    {
        System.out.println("inside meth method");
        //as ArrayIndexOfBoundsException is unchecked exception so compiler doesnt give
        //compiler error even if we don't add exception handling code below.

        //correct your code so that u no longer get index out of bounds exception
     //   for(int i=0;i<=arr.length;i++)   //incorrect  coding - programmer's mistake
        for(int i=0;i<arr.length;i++) //correct coding
        {
            System.out.println(arr[i]);
        }
        System.out.println("at the end of meth method...");
    }
}
