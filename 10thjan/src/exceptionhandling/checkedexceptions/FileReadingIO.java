package exceptionhandling.checkedexceptions;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingIO {
    public static void main(String[] args) {
        System.out.println("program starts..");
         meth("abc.java");
        System.out.println("remaining program continues...");
    }

    static void meth(String filename)
    {
        FileReader fr=null;
        System.out.println("inside meth method...");
        //IOException and FileNotFound exception need to be handled or declared
        //as they come under the category of checked exceptions (occur due to external situations)
        try {
             fr = new FileReader(filename);
            char ch = (char) fr.read();//some exception occ
            System.out.println(ch);

        }
        catch(IOException e)
        {
           // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("File abc.java does not exist, create the file");
        }

        try
        {
            if(fr!=null)
                fr.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("remaining code of meth() method continues,,,");
    }
}
