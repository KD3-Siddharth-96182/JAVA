package com.sunbeam;

import java.util.Scanner;

public class Que02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()%2==0) {
			System.out.println("String is not palindrome");
		}
		String str2="";
		System.out.println("Given string: "+ str);
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given String is NOT palindrome");
		}
		sc.close();
		
	}
	
}
