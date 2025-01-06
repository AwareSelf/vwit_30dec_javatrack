package exceptionhandling.checkedexceptions;

import com.sun.source.tree.TryTree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingIO2 {
    public static void main(String[] args)  {
        System.out.println("program starts..");
        try {
            meth("abc.java");
       }
        catch(FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch(IOException e)
        {
                e.printStackTrace();
        }

        System.out.println("remaining program continues...");
    }

    //meth method doesn't handle the exception but propagates/declares the
    // exception using throws clause .
    // compiler will then check if exception is handled/declared by it's caller method
    static void meth(String filename)throws IOException
    {
        System.out.println("inside meth method...");
        //IOException and FileNotFound exception need to be handled or declared
        //as they come under the category of checked exceptions (occur due to external situations)

            FileReader fr = new FileReader(filename);
            char ch = (char) fr.read();
            System.out.println(ch);


        System.out.println("remaining code of meth() method continues,,,");
    }
}
