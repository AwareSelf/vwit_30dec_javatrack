package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToListListToArray {
    public static void main(String[] args) {

     //   Integer[] arr = new Integer[5]; - if you don;t want array with default value
          Integer[] arr = {4,5,7,8,9}; //definition and initializatn both combined into one

        //Integer array to List
        List<Integer> lst = Arrays.asList(arr);

        //requirement: from array arr, filter out all integer values greater than 5 and create a list out of it
        //convert array into stream
        Stream<Integer> str = Arrays.stream(arr);
        List<Integer> lst1 = str.filter(e->e>5).toList();
        System.out.println(lst1);

        lst1 = Arrays.stream(arr).filter(e->e>5).toList();


        //converting primitive array into List of corresponding wrapper type is not possible as Arrays.asList
        //method does not accept primitive array
      //  List<Integer> lstt = Arrays.asList(arr1);  //-- gives error
          int[] arr1= {5,7,8,9};
          List<Integer> lstt = Arrays.stream(arr1).boxed().toList();


        //find sum of all int primitive in primitive int array
        int[] arrx= {5,7,8,9};
        int total = Arrays.stream(arrx).sum();

        //find the sum of Integer objects in Integer Object array/Integer List
        List<Integer> lsst = new ArrayList<>();
        lst.add(5);
        lst.add(6);
        lst.add(10);

       // List of Integer Objects cannot be summed ->as when you lst into stream it will stream of objects
        // and sum aggregate function cannot be called on stream of Integer Object types
        int summ = lsst.stream().mapToInt(e->e.intValue()).sum();
        System.out.println(summ);



    }
}
