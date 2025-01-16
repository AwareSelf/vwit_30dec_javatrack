package org.example;

public class UseStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();

        for(int i=100;i<=105;i++)
           s.push(i);


        do {
            if(!s.isStackEmpty())
                System.out.println(s.pop());
            else
                break;
         }while(true);

    }
}
