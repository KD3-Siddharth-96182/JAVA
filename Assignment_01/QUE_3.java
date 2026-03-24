import java.util.Scanner;

public class QUE_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		double priceEgg = 50.0;  //
        double priceDosa = 20.0;  
        double priceSamosa = 30.0; 
        double priceIdli = 40.0;  
        double priceVada = 60.0; 
        double pricePavBhaji = 80.0;  
        double priceDhokla = 45.0;  
        double pricePoha = 25.0;  
        double priceParatha = 70.0;  

        double totalBill = 0.0;
		while((choice=menuList(sc))!=0) {
			 if (choice == 10) {
	                System.out.println("Your Bill is: " + totalBill);
	                break;
	            }
			 else if(choice>=1 && choice<=9) {
				System.out.println("Enter quantity: ");
				int quantity = sc.nextInt();
				switch(choice) {
				case 1:
					totalBill+=priceEgg* quantity;
					break;
				case 2:
					totalBill+=priceDosa * quantity;
					break;
				case 3:
					totalBill+=priceSamosa * quantity;
					break;
				case 4:
					totalBill+=priceIdli  * quantity;
					break;
				case 5:
					totalBill+=priceVada  * quantity;
					break;
				case 6:
					totalBill+=pricePavBhaji  * quantity;
					break;
				case 7:
					totalBill+=priceDhokla  * quantity;
					break;
				case 8:
					totalBill+=pricePoha  * quantity;
					break;
				case 9:
					totalBill+=priceParatha  * quantity;
					break;
					
				default :
					break;
				}
			}
			else {
			    System.out.println("Invalid choice!");
			}
		}
		
		System.out.println("Thank you!");
				
	}

	public static int menuList(Scanner sc) {
		
		int choice;
		System.out.println("0:Exit ");
		System.out.println("1.Egg: RS: 50");
		System.out.println("2.Dosa: RS: 20");
		System.out.println("3.Samosa: RS: 30");
		System.out.println("4.Idli: RS:40 ");
		System.out.println("5.Vada: RS: 60");
		System.out.println("6.Pav bhaji: RS: 80");
		System.out.println("7.Dhokla: RS: 45");
		System.out.println("8.Poha: RS: 25");
		System.out.println("9.Paratha: RS: 70");
		System.out.println("10.Generate Bill: ");
		System.out.println("Enter choice: ");
		choice=sc.nextInt();
		return choice;
		
	}
}
