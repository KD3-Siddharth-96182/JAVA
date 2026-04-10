package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner  sc = new Scanner(System.in);
	        List<Student> list = new ArrayList<>();

	        int choice;
	        do {
	        	System.out.println("0. Exit");
	            System.out.println("1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search by RollNo");
	            System.out.println("4. Sort by RollNo");
	            System.out.println("5. Sort by Name");
	            System.out.println("6. Sort by Marks");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter RollNo: ");
	                    int r = sc.nextInt();
	                    System.out.print("Enter Name: ");
	                    String n = sc.next();
	                    System.out.print("Enter Marks: ");
	                    double m = sc.nextDouble();
	                    list.add(new Student(r, n, m));
	                    break;

	                case 2:
	                    Iterator<Student> it = list.iterator();
	                    while (it.hasNext())
	                        System.out.println(it.next());
	                    break;

	                case 3:
	                    System.out.print("Enter RollNo to search: ");
	                    int key = sc.nextInt();
	                    boolean found = false;
	                    for (Student s : list) {
	                        if (s.rollNo == key) {
	                            System.out.println(s);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found");
	                    break;

	                case 4:
	                    list.sort((a, b) -> a.rollNo - b.rollNo);
	                    break;

	                case 5:
	                    list.sort((a, b) -> a.name.compareTo(b.name));
	                    break;

	                case 6:
	                    list.sort((a, b) -> Double.compare(a.marks, b.marks));
	                    break;
	            }
	        } while (choice != 0);
	        sc.close();
	}

}
