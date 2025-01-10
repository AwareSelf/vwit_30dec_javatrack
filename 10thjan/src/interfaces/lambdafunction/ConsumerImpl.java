package interfaces.lambdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> ref = (name)-> System.out.println("my name is:"+name+
                                            ",length of name is:"+name.length());
        ref.accept("namrata");

        Consumer<String[]> ref1 = (students)->{
            /*
            for(int i=0;i<students.length;i++)
                System.out.println(students[i]); */
            System.out.println("display using for-each loop");
            for(String s:students)
                System.out.println(s);
        };
        String[] studlist = {"ritik","shubhangi","ankush","ashrey"};
        ref1.accept(studlist);

        List<String> lst = new ArrayList<>();
        lst.add("Ananya");
        lst.add("Geeta");
        lst.add("Ujesh");
        lst.add("Aman");
       // System.out.println(lst);

        Consumer c = (e)-> System.out.println(e);
        lst.forEach(c);
        //above is same as below
        lst.forEach((e)-> System.out.println(e));

    }


}
