/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Starting point, Menu system has been implemented in this class
 * */

import java.util.Scanner;
public class Assignment2 {

	//Starting point
	public static void main(String[] args) {
		
		//create a object of EmployeeList
		EmployeeList allEmployee=new EmployeeList();
		//Create a Scanner object.
		Scanner option=new Scanner(System.in);
		
		String input;
		
		//do while loop to print out the menu system.
		do {
			System.out.println("a: Adding a new Employee Account(Management/Development) ");
			
			System.out.println("u: Update a email address an an employee ");
			
			System.out.println("d: Display the employees supervised by a Manager ");
			
			System.out.println("p: Print the info of all employees ");
			
			System.out.println("m: Run monthly payroll ");
			
			System.out.println("s: Search an employee ");
			
			System.out.println("r: Remove a list of employees ");
			
			System.out.println("e: Promote an employee from Development to Management ");
			
			System.out.println("i: Update the Employee ID");
			
			System.out.println("q: Quit ");
			
			System.out.println();
			
			System.out.print("Enter your option: ");
			input=option.nextLine();
			
			System.out.println();
			//From line 50-106 are decision structure , every decision execute a method. 
			 if (input.equalsIgnoreCase("a")) {
				
				allEmployee.addEmployee(option);
    
			}
			
			else if (input.equalsIgnoreCase("u")) {
				
				allEmployee.updateEmail(option);
				
			}
			
			else if (input.equalsIgnoreCase("d")) {
				
				allEmployee.displayTeamEmployee(option);
			}
			
			else if (input.equalsIgnoreCase("p")) {
				
				allEmployee.printEmployeeDetails();
				
			}
			
			else if (input.equalsIgnoreCase("m")) {
				
				allEmployee.monthlyPayroll();
				
			}
			
			else if (input.equalsIgnoreCase("s")) {
				
				allEmployee.searchEmployee(option);
				
			}
			
			else if (input.equalsIgnoreCase("r")) {
	
				allEmployee.removeEmployeee(option);
				
			}
			
			else if (input.equalsIgnoreCase("e")) {
	
				//allEmployee.promoteEmployee(option);
				allEmployee.promoteEmployee(option);
				
			}
			 
			else if (input.equalsIgnoreCase("i")) {
				
				allEmployee.updateEmployeeId(option);
				
			}
			
			else if (input.equalsIgnoreCase("q")) {
	
			}
			

			
		}while(!input.equalsIgnoreCase("q"));
		
		System.out.print("Quit: Successfully exited the program");
		
	}

}
