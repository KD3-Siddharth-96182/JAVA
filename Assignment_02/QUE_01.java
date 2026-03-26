import java.util.Scanner;

public class QUE_01 {

	public static void main(String[] args) {
		InvoiceTest invoiceTest=new InvoiceTest();
		invoiceTest.accept();
		invoiceTest.display();
		double invoiceAmt=invoiceTest.calcInvoiceAmount();
		System.out.print("Invoice amount: "+ invoiceAmt);
		
	}

}


class Invoice{
	private String partNum;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Invoice() {};
	public Invoice(String partNum, String partDesc, int quantity,double price) {
		this.partNum=partNum;
		this.partDesc=partDesc;
		if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (price > 0)
            this.price = price;
        else
            this.price = 0.0;
	}
	//setters
	public void setPartNum(String partNum) {
		this.partNum=partNum;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc=partDesc;
	}
	public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            this.price = 0.0;
    }
	//getters
	public String getPartNum() {
		return this.partNum;
	}
	public String getPartDesc() {
		return this.partDesc;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
}

class InvoiceTest{
//	Invoice invoiceTest=new Invoice("P101", "Mouse", 2, 500);
	
	Invoice invoiceTest=new Invoice();
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Part Number: ");
        String partNumber = sc.nextLine();
        invoiceTest.setPartNum(partNumber);

        System.out.print("Enter Description: ");
        String description = sc.nextLine();
        invoiceTest.setPartDesc(description);

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        invoiceTest.setQuantity(quantity);

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();
        invoiceTest.setPrice(price);
	}
	
	public void display() {
		System.out.println("Part Number : " + invoiceTest.getPartNum() );
		System.out.println("Part Description : " + invoiceTest.getPartDesc() );
		System.out.println("Part Quantity : " + invoiceTest.getQuantity() );
		System.out.println("Part Price : " + invoiceTest.getPrice() );
	}
	
	
	
	public double calcInvoiceAmount() {
		return invoiceTest.getPrice() * invoiceTest.getQuantity();
	}
	
}



















