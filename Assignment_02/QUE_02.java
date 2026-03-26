
public class QUE_02 {

	public static void main(String[] args) {
			
		 	Employee emp1 = new Employee("Siddharth", "Rukadikar", 30000);
	        Employee emp2 = new Employee("Rahul", "Sharma", 40000);

	        EmployeeTest empTest=new EmployeeTest();
	        
;	        System.out.println("---- Before Raise ----");
	        empTest.display(emp1);
	        empTest.display(emp2);

	        // Apply 10% raise
	        empTest.applyRaise(emp1);
	        empTest.applyRaise(emp2);

	        System.out.println("\n---- After 10% Raise ----");
	        empTest.display(emp1);
	        empTest.display(emp2);
	        
	        
	}

}

class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }
}


class EmployeeTest {
	
    // Calculate yearly salary
    public  double calculateYearlySalary(Employee emp) {
        return emp.getMonthlySalary() * 12;
    }

    // Apply 10% raise
    public  void applyRaise(Employee emp) {
        double newSalary = emp.getMonthlySalary() * 1.10;
        emp.setMonthlySalary(newSalary);
    }

    // Display employee details
    public  void display(Employee emp) {
        System.out.println(
            emp.getFirstName() + " " + emp.getLastName() +
            " | Monthly Salary: " + emp.getMonthlySalary() +
            " | Yearly Salary: " + calculateYearlySalary(emp)
        );
    }
}


