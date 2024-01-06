/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Collection the common attribute of IT Developer and IT Analyst,
 *  and implement setter and getter, toString method, addEmployee method.
 * */
import java.util.Scanner;

//Abstract Development class implements Employee interface
public abstract class Development implements Employee {
	
	protected int employeeID;
	
	protected String firstName;
	
	protected String lastName;
	
	protected String email;
	
	protected double yearlySalary;
	
	protected int superVisorId;
	
	//no arguments constructor
	public Development() {
		
	}
	//From line 30-77 are getter and setter of variables
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public int getSuperVisorId() {
		return superVisorId;
	}
	
	public void setSuperVisorId(int superVisorId) {
		this.superVisorId=superVisorId;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID=employeeID;
	}
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary=yearlySalary;
	}
	
	public String toString() {
		
		return String.format("Name: %s %s | Employee ID:%2d | Email:%2s | Yearly Salary:%2.0f | Supervisor ID:%2d",firstName,lastName,employeeID,email,yearlySalary,superVisorId);
		
	}
	
	public void addEmployee(Scanner input) {
		
		System.out.print("Enter first name of the employee: ");
		firstName=input.nextLine();
		
		System.out.print("Enter last name of the employee: ");
		lastName=input.nextLine();
		
		try {System.out.print("Enter ID of the employee: ");
		
		employeeID=input.nextInt();
		
		//Consume the new line character;
		input.nextLine();
		
		}catch (Exception e){
			
			System.out.println("Wrong type of input,Please update employee ID later.");
			
			//consume the bad input.
			input.nextLine();
		}
		
		System.out.print("Enter the Email of employee: ");
		email=input.nextLine();
		
		try {
			System.out.print("Enter Salary of the employee: ");
			
			yearlySalary=input.nextDouble();
			//consume the new line character.
			input.nextLine();
			
			}catch(Exception e) {
				
			System.out.println("Wrong type of input,Please update employee Salary later.");
			//consume the bad input
			input.nextLine();
		}
		
		try{
			System.out.print("Enter the Supervisor's ID of the employee:");
			
			superVisorId=input.nextInt();
			
			//consume the new line character
			input.nextLine();}catch(Exception e) {
			
			System.out.println("Please input a number");
			
			//consume the bad input
			input.nextLine();
		}
		
	}

}
