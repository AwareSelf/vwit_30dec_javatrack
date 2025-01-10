package corejavabasic;

public class FinalEx {
    static int nox;

    static final double PI = 3.14;

    static {
        nox = 8;
        nox++;
    }

    public static void main(String[] args) {
        final int no;
        no = 8;

      //  no++;
       // static int no1; //static cannot be a local variable, can't define in a method

    }

    public void meth()
    {
        System.out.println(PI);
        //static int no;  //static cannot be a local variable, can't define in a method
    }
}
