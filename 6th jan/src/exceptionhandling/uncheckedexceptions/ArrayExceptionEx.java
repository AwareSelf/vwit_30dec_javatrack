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
        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("at the end of meth method...");
    }
}
