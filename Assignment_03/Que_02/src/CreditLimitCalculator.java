import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            Customer c = new Customer();

            c.accept(sc);   
            c.display();    

            System.out.print("\nDo you want to enter another customer? (y/n): ");
            choice = sc.next().charAt(0);

            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}