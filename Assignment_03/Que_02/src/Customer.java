class Customer {
    private int accountNo;
    private int balance;
    private int charges;
    private int credits;
    private int creditLimit;

    public void accept(java.util.Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();

        System.out.print("Enter Beginning Balance: ");
        balance = sc.nextInt();

        System.out.print("Enter Total Charges: ");
        charges = sc.nextInt();

        System.out.print("Enter Total Credits: ");
        credits = sc.nextInt();

        System.out.print("Enter Credit Limit: ");
        creditLimit = sc.nextInt();
    }

    public int calculateNewBalance() {
        return balance + charges - credits;
    }

  
    public void display() {
        int newBalance = calculateNewBalance();

        System.out.println("\nAccount Number: " + accountNo);
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Within credit limit");
        }
    }
}