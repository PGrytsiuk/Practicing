package main.com.arrays_operations;

import java.util.Date;

public class Stack {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push("Hello");
        stack.push(new Date(1992, 11, 12));
        stack.push(0);
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Popped value: " + stack.pop());
        stack.clear();
    }

    private Object[] stackArray;
    private int top;

    public Stack()
    {
        stackArray = new Object[100];
        top = -1;
    }

    public void push(Object value)
    {
        if (top == stackArray.length -1)
        {
            throw new StackOverflowError("Stack is full");
        }else if(value == null)
        {
            throw new IllegalArgumentException("Cannot push null value onto stack");
        }else
        {
            stackArray[++top] = value;
        }
    }

    public Object pop()
    {
        if(top == -1)
        {
            throw new IllegalStateException("Stack is empty");
        }
        Object value = stackArray[top];
        top--;
        return  value;
    }

    public void clear()
    {
        stackArray = new Object[stackArray.length];
        top = -1;
    }

}
