package exceptionhandling.checkedexceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingIO {
    public static void main(String[] args) {
        System.out.println("program starts..");

        try {
            FileReader fr = new FileReader("abc.java");
            char ch = (char) fr.read();
            System.out.println(ch);
        }
        catch(IOException e)
        {

           // e.printStackTrace();
           // System.out.println(e.getMessage());
            System.out.println("File abc.java does not exist, create the file");
        }
        System.out.println("remaining program continues...");
    }
}
