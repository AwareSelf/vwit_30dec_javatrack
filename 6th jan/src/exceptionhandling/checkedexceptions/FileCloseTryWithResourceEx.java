package exceptionhandling.checkedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FileCloseTryWithResourceEx {
    public static void main(String[] args) {
        System.out.println("program starts..");
         meth("abc.java");
        System.out.println("remaining program continues...");
    }

    static void meth(String filename)
    {

        System.out.println("inside meth method...");
        //IOException and FileNotFound exception need to be handled or declared
        //as they come under the category of checked exceptions (occur due to external situations)
       //try-with-reource clause, file resource will be auto-closed
        try(FileReader fr = new FileReader(filename);) {


            char ch = (char) fr.read();//some exception occ
            System.out.println(ch);

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {

           // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("File abc.java does not exist, create the file");
            if(filename.endsWith(".java"))
                return;
        }


        System.out.println("remaining code of meth() method continues,,,");
    }
}
