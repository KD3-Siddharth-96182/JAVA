package com.sunbeam;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Book> list = new ArrayList<>();

	        int choice;
	        do {
	            System.out.println("0. Exit");
	            System.out.println("1. Add Book");
	            System.out.println("2. Display Forward");
	            System.out.println("3. Display Reverse");
	            System.out.println("4. Delete by Index");
	            System.out.println("5. Sort by Price Desc order");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ISBN: ");
	                    String isbn = sc.next();
	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();
	                    System.out.print("Enter Author Name: ");
	                    String author = sc.next();
	                    System.out.print("Enter Quantity: ");
	                    int qty = sc.nextInt();
	                    list.add(new Book(isbn, price, author, qty));
	                    break;

	                case 2:
	                    for (Book b : list)
	                        System.out.println(b);
	                    break;

	                case 3:
	                    for (int i = list.size() - 1; i >= 0; i--)
	                        System.out.println(list.get(i));
	                    break;

	                case 4:
	                    System.out.print("Enter index: ");
	                    int index = sc.nextInt();
	                    if (index >= 0 && index < list.size())
	                        list.remove(index);
	                    else
	                        System.out.println("Invalid index");
	                    break;

	                case 5:
	                    list.sort((a, b) -> Double.compare(b.price, a.price));
	                    break;
	            }
	        } while (choice != 0);
	        sc.close();
	}

}
