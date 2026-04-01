package com.sunbeam;

import java.util.Scanner;

public class Que3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		  if (str.trim().isEmpty()) {
	            System.out.println("Count : 0");
	        } else {
	            int count = str.trim().split("\\s+").length;
	            System.out.println("Count : " + count);
	        }
		sc.close();
		
	}
	
}
