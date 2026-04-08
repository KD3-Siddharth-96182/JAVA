package com.sunbeam.Que1;


public class FixedStack implements Stack {
    private Employee[] arr;
    private int top;

    public FixedStack() {
        arr = new Employee[Stack_Size];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == Stack_Size - 1) {
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = e;
        System.out.println("Employee pushed");
    }

    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return null;
        }
        return arr[top--];
    }
}