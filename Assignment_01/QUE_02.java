import java.util.Scanner;

public class QUE_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter num1: ");
		String str1=sc.next();
		if(!str1.contains(".")) {
			System.out.println("please enter double value");
			return;
		}
		double num1=Double.parseDouble(str1);
		
		System.out.println("Enter num2: ");
		String str2=sc.next();
		if(!str2.contains(".")) {
			System.out.println("please enter double value");
			return;
		}
		double num2=Double.parseDouble(str2);
		
		double average=(num1+num2) / 2;
		
		
		System.out.println("num are: " +num1 + ", " + num2);
		System.out.println("AVERAGE IS : " + average);
	}

}