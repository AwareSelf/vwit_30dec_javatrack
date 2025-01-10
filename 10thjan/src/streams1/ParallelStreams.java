package streams1;

// Java Program to Illustrate Parallel Streams
// Using parallel() method on a Stream

// Importing required classes
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

// Main class
// ParallelStreamTest
public class ParallelStreams {

    /*
    https://www.geeksforgeeks.org/what-is-java-parallel-streams/

    The order of execution, however, is not under our control.
    Therefore, it is advisable to use parallel streams in cases where no matter
    what is the order of execution, the result is unaffected and the
    state of one element does not affect the other as well as the source
    of the data also remains unaffected.
     */
    // Main driver method
    public static void main(String[] args) throws IOException {

        // Creating a File object
        File fileName = new File("C:\\volkwagen\\VWIT_30dec2024_JAVATrack\\corejava\\src\\streams1\\readme.txt");

        // Create a Stream of string type
        // using the lines() method to
        // read one line at a time from the text file
        Stream<String> text = Files.lines(fileName.toPath());

        //sequential stream and foreach each stream element - each string line
       // text.forEach(s-> System.out.println(s));

        // Creating parallel streams using parallel() method
        // later using forEach() to print on console
         text.parallel().forEach(s-> System.out.println(s));
       // text.parallel().forEach(System.out::println);

        // Closing the Stream
        // using close() method
        text.close();
    }
}
