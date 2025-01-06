package exceptionhandling.uncheckedexceptions;

public class ExceptionEx2 {
    public static void main(String[] args) {
        String s  = "Namrata"; // String object with value Namrata gets created behnd the secene
        System.out.println("program started..");
        meth(s);
        s=null;
        meth(s);
        System.out.println("remaining program..");
    }


    static void meth(String s)
    {
        System.out.println("function meth called...");
       if(s!=null)
          System.out.println(s.charAt(0));
        else
            System.out.println("s ref is null");

        System.out.println("remaining code in a function..");

    }
}
