package streams1;
// important import statement
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ParallelStreams2
{

    // main method
    public static void main(String[] argvs)
    {

        System.out.println("In Normal");

        IntStream intstrm = IntStream.of(1,10,4,13,5,9);
        intstrm.forEach(n-> System.out.println(n));

        int[] intarr = {40,50,70,80,100};
         int total = IntStream.of(intarr).sum();

        //find avg of all value in range a to b
        IntStream r = IntStream.rangeClosed(1000, 1010);
       // DoubleStream dstr = r.asDoubleStream();
       // System.out.println(dstr.average());
        IntStream.rangeClosed(1000, 1010).forEach(n-> System.out.println(n));

        System.out.println("In Parallel");
        // prints values from 1 to 5 (1 and 5 included)
        IntStream r1 = IntStream.rangeClosed(1000, 1010);
        r1.parallel().forEach(s-> System.out.println(s));

    }

}
