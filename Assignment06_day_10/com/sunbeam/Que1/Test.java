package com.sunbeam.Que1;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = null;

        int choice;

        do {
            System.out.println("1 Choose Fixed Stack");
            System.out.println("2 Choose Growable Stack");
            System.out.println("3 Push data");
            System.out.println("4 Pop data");
            System.out.println("0: Exit");
            System.out.println("Enter choice:");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
                if (stack == null)
                    stack = new FixedStack();
                else
                    System.out.println("Stack already selected");
                break;

            case 2:
                if (stack == null)
                    stack = new GrowableStack();
                else
                    System.out.println("Stack already selected");
                break;

            case 3:
                if (stack == null) {
                    System.out.println("NO stack chosen");
                } else {
                    System.out.println("Enter id:");
                    int id = sc.nextInt();
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter salary:");
                    double salary = sc.nextDouble();

                    stack.push(new Employee(id, name, salary));
                }
                break;

            case 4:
                if (stack == null) {
                    System.out.println("NO stack chosen");
                } else {
                    Employee e = stack.pop();
                    if (e != null)
                        System.out.println(e);
                }
                break;

            }
        } while (choice != 0);

        sc.close();
    }
}