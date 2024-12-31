

import java.util.Scanner;

public class LoopsEx {
 int x;
    public static void main(String[] args) {

        //step 1:create object of Scanner (import Scanner at start)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1:");
        //use Scanner using relevant nextxxx() method
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        genNumList(n1,n2);
        genNumListUsingWhile(n1,n2);
        //step 3: to close the Scanner
        sc.close();


    }

     static void genNumList(int start,int end)
    {
        for(int i=start;i<=end;i++) {
            System.out.println(i);
        }

    }

    static void genNumListUsingWhile(int start,int end)
    {
        int i = start;

        while(i<=end)
        {
            System.out.println(i);

            i++;
        }
        System.out.println("after while remaining code will be executed..");
    }



}
