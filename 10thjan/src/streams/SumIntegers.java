package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumIntegers {

    public static void main(String... args) {


        List<Integer> numbers = Arrays.asList(4, 5, 2, 5, 6);

        int sum1 = numbers.stream().mapToInt(no -> no.intValue()).sum();
        System.out.println(sum1);

        long tot = numbers.stream().count();

    }
}
