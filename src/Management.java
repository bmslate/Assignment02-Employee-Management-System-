/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Collection the common attribute of Manager,
 *  and implement setter and getter, toString method, addEmployee method.
 * */
import java.util.Scanner;

public abstract class Management implements Employee{
//	employee ID-int
//type, first name-String type, last name-String type, email-String type, yearly salary-double type, team name-
//	String type).
	
	protected int employeeID;
	
	protected String firstName;
	
	protected String lastName;
	
	protected String email;
	
	protected double yearlySalary;
	
	protected String teamName;
	
	protected String designation="Manager";

	
	//no arguments constructor
	public Management() {
		
	}
	// Getter and Setters
	public int getEmployeeID() {
		
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		
		this.employeeID=employeeID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
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
	
	public double getYearlySalary() {
		return yearlySalary;
	}
	
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary=yearlySalary;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}
	
	// To String method
	public String toString() {
		
		return String.format("Name:%2s %2s | Employee ID:%2d | Email:%2s | Yearly Salary:%2.0f | Designation:%2s | Team Name: %s ",firstName,lastName,employeeID,email,yearlySalary,designation,teamName);
		
	}
	// add employee to 
	public void addEmployee(Scanner input) {
		
		System.out.print("Enter first name of the manager: ");
		firstName=input.nextLine();
		
		System.out.print("Enter last name of the manager: ");
		lastName=input.nextLine();
		
	//In order to handle a case that a new promoted or employed manager has not been assigned with a employee Id by the HR Department, 
	//so,The program allows the user to continue record the other information of the manager instead of stopping the program.
		
		try{
			System.out.print("Enter ID of the manager: ");
			
			employeeID=input.nextInt();
			//consume the new line character.
			input.nextLine();
			
			
		 	}catch(Exception e) {
			   
		 		System.out.println("Wrong type of input,Please update employee ID later.");
			//consume the bad input
		 		input.nextLine();
		 		}
	
		
		System.out.print("Enter the Email of the manager: ");
		email=input.nextLine();
		
		//Handle the case that the company has not finally make a decision that the component of annual salary of the new manager
		//like commission.So the program allows the user to continue record the other information of the manager.
		try {
			
			System.out.print("Enter Salary of the manager: ");
		
			yearlySalary=input.nextDouble();
		
		//consume the new line character;
			input.nextLine();
		}catch (Exception e) {
			System.out.println("Wrong type of input,Please update employee Salary later.");
		
			//consume the bad input.
			input.nextLine();
		}
		

			
			System.out.print("Enter the team name of the manager: ");
		
			teamName=input.nextLine();
		
	
	}

}
