package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> arrlst;

    public MyStack()
    {
        this.arrlst = new ArrayList<>();
    }
    public void push(int no)
    {
        this.arrlst.add(no);
    }

    public int pop()
    {

        if(this.arrlst.isEmpty())
        {
            throw new StackEmpty("Stack is empty!");
        }
        else
           return this.arrlst.remove(this.arrlst.size()-1); //stack top = this.arrlst.size()-1
    }

    public boolean isStackEmpty()
    {
        return this.arrlst.isEmpty();
    }

    public int getStackTop()
    {
        return this.arrlst.size()-1;
    }


}
class StackEmpty extends RuntimeException
{
    StackEmpty(String message)
    {
        super(message);
    }
}
