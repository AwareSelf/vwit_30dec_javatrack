package sortingsearching;

public class ArrayEx {

    public static void main(String[] args) {
        int[] arr;   //java.util.ArrayList
        arr = new int[5];
        int[] arr1 = new int[10];

        //initialize the array
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=i+1;
        }
        //display array using for each loop
        for(int x:arr1)
        {
            System.out.println(x);
        }
        int[] arr2 = {5,6,1,5,6}; //array definition & initializatn combined into one
        //for-each loop - display a collection
        for(int x :arr2) // x =arr2[0]
        { System.out.println(x);
        }


    }
}
