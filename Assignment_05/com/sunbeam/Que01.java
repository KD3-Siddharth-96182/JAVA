package com.sunbeam;

import java.util.Scanner;

public class Que01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2="";
		System.out.println("String :" + str);
		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print( str.charAt(i));
			str2+=str.charAt(i);
		}
		
		System.out.println("Rev string:-- " + str2);
		sc.close();
	}

}
