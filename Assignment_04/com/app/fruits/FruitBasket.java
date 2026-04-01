package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter basket size: ");
		int n=sc.nextInt();
		Fruit[] basket=new Fruit[n];
		int counter=0;
		
		int choice;
		
		do {
			 	System.out.println("\n0. Exit");
	            System.out.println("1. Add Mango");
	            System.out.println("2. Add Orange");
	            System.out.println("3. Add Apple");
	            System.out.println("4. Display Name of Fruits");
	            System.out.println("5. Display Details");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            
	            switch(choice) {
	            	case 1:
	            		if(counter<n) {
	            			basket[counter]=new Mango("Mango", "Yellow",1.5);
	            			counter++;
	            		}else {
	            			System.out.println("Basket is full!");
	            		}
	            		break;
	            	case 2:
	            		if(counter<n) {
	            			basket[counter]=new Orange("Orange", "Orange", 0.7);
	            			counter++;
	            		}else {
	            			System.out.println("Basket is full!");
	            		}
	            		break;
	            	case 3:
	            		 if (counter < n) {
	                         basket[counter]=new Apple("Apple", "Red", 1.8);
		            		 counter++;
	                     } else {
	                         System.out.println("Basket is full!");
	                     }
	            		break;
	            	case 4:
	            		System.out.println("Names of all fruits: ");
	            		for(Fruit f:basket) {
	            			if(f!=null)
	            				System.out.println(f.getName()+ " ");
	            			
	            		}
	            		break;
	            	case 5:
	            		System.out.println("Details of all Fresh fruits: ");
	            		for(Fruit f: basket) {
	            			if(f!=null && f.isFresh()) {
	            				System.out.println(f.toString());
	            				System.out.println(f.taste());
	            			}
	            		}
	            		break;
	            	case 6:
	            		System.out.println("Display tastes of all stale (Not Fresh) fruits: ");
	            		for(Fruit f: basket) {
	            			if(f!=null && !f.isFresh()) {
	            				
	            				System.out.println(f.taste());
	            			}
	            		}
	            		break;
	            	case 7:
	            		System.out.println("enter index :");
	            		int index=sc.nextInt();
	            		if(index>0 && index<counter && basket[index] !=null) {
	            			basket[index].setIsFresh(false);
	            		}else {
	            			 System.out.println("Invalid index!");
	            		}
	            		break;
	            	case 8:
	            		System.out.println("Marking all sour fruits as stale");
	            	    for (Fruit f : basket) {
	            	        if (f != null && f.taste().equals("sour")) {
	            	            f.setIsFresh(false);
	            	        }
	            	    }
	            	    System.out.println("Done.");
	            	    break;
	            		
	            }
		}while(choice!=0);
		
		sc.close();
		

	}

}
