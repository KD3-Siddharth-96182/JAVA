package com.sunbeam.Que1;

import java.util.Arrays;

public class GrowableStack implements Stack {
    private Employee[] arr;
    private int top;

    public GrowableStack() {
        arr = new Employee[Stack_Size];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == arr.length - 1) {
            arr = Arrays.copyOf(arr, arr.length * 2);
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