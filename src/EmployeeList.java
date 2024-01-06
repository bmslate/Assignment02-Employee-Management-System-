/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Implemented all functional method,such as, add employee, search, remove, display,etc.
 * */

import java.util.Scanner;
import java.util.ArrayList;


public class EmployeeList {
	
	protected int count=1;
	
	protected ArrayList<Management> ManagementEmployee=new ArrayList<>();

	protected ArrayList<Development> DevelopmentEmployee=new ArrayList<>();
	
	//no arguments constructor
	public EmployeeList() {
		
	}
	
	//adding employee 
	public void addEmployee(Scanner input) {
		
		System.out.printf("Enter details of the employee %d%n",count);
		
		System.out.println("===============================");
		
		System.out.print("Type (without quotations) 'm' for Manager or 'd' for IT Developer or 'a' for IT Analyst: ");
		
		String option=input.nextLine();
		
		if(option.equalsIgnoreCase("m")) {
			//create a object of manager
			Management employee=new Manager();
			//accepting user's input 
			employee.addEmployee(input);
			//add manager to ManagementEmployee ArrayList.
			ManagementEmployee.add(employee);
			
			count++;
			
		}
		
		else if(option.equalsIgnoreCase("d")) {
			//create a IT Developer object
			Development itEmployee=new ITDeveloper();
			//Accepting user's input
			itEmployee.addEmployee(input);
			//adding object to ArrayList
			DevelopmentEmployee.add(itEmployee);
			
			count++;
			
		}
		
		else if(option.equalsIgnoreCase("a")) {
			//create a IT Developer object	
			Development anaylistEmployee=new ITAnalyst();
			//Accepting user's input
			anaylistEmployee.addEmployee(input);;
			//adding object to ArrayList
			DevelopmentEmployee.add(anaylistEmployee);
			
			count++;
			
		}
		
	}
	
	//print employee details
	public void printEmployeeDetails() {
		
		System.out.println("Employee Management System");
		
		System.out.println("**************************");
		
		System.out.printf("Number of Employees: %d%n",count-1);
		System.out.println();
		
		System.out.println("List of Management Employee");
		System.out.println();
		
		// use enhanced for loop to go throng every manager object.
		for(Management m:ManagementEmployee) {
			
			System.out.println( m.toString());
			
		}
		System.out.println();
		
		System.out.println("List of Development Employee");
		System.out.println();
		// go through every developer and analyst object.
		for (Development it:DevelopmentEmployee) {
	
			System.out.println(it.toString());
			
		}
		System.out.println();
		
	}
	
	//update email
	public void updateEmail(Scanner input) {
		//catch wrong type of input
		try {
			System.out.println("Enter the ID of the employee whose email needs to be updated");
			int searchID=input.nextInt();
			
			//consume the newline character
			input.nextLine();
			
			System.out.println("Enter the new Email address of the employee");
			
			String newEmail=input.nextLine();
			
				for(Management manager:ManagementEmployee) {
					
					if(manager.getEmployeeID()==searchID) {
						manager.setEmail(newEmail);
						
						System.out.printf("The new email address of %s %s is : %s%n",manager.getFirstName(),manager.getLastName(),newEmail);
					}
				
				}
			}catch (Exception e) {
				System.out.println("Unexpected type of input");
				}
	}
	
	public void displayTeamEmployee(Scanner input) {
		
		System.out.println("Enter the employee ID of the Team Manager");
		
		//Declare a boolean variable as a condition of do-while loop to handle the bad input from the user.
		boolean verify=false;
		
		//Declare a boolean variable as a condition of if the ID number are not found in database.
		boolean found=false;
		
		int employeeId = 0;
		
		do {
			 try {
				 employeeId=input.nextInt();
		
				 //consume the new line character.
				 input.nextLine();
				 
				 verify=true;

			 }catch (Exception e) {
				
			System.out.print("Please enter a number.");
			
			 input.nextLine();
			 
			 }	
			 
		}while(!verify);
			
		System.out.println("===========================");
		
		for(Development employee:DevelopmentEmployee) {
			
			if (employeeId==employee.getSuperVisorId()) {
					
			System.out.println(employee.toString());
			
			//control variable set to true.
			found=true;
			
			
			
		} 
	 }
		System.out.println();
		//if control variable found=false the code will execute,if found =true; the code will not execute;
		if(!found) {
			//prompts user check the ID.
			System.out.println("No such Employee ID exsist");
			
			System.out.println();
		}
	  }
	
	public void monthlyPayroll() {
		
		System.out.println("Monthly Payroll for all employees");
		System.out.println("==================================");
		
		for(Management s:ManagementEmployee) {
			
		double monthlySalary=(s.getYearlySalary()*0.8)/12;
		
		System.out.printf("Monthly payroll of %s %s is : %.2f%n",s.getFirstName(),s.getLastName(),monthlySalary);
		}
		
		for(Development s:DevelopmentEmployee) {
			
			double monthlySalary=(s.getYearlySalary()*0.8)/12;
			
			System.out.printf("Monthly payroll of %s %s is : %.2f%n",s.getFirstName(),s.getLastName(),monthlySalary);
			}
		
		System.out.println();
	}
	
	public void searchEmployee(Scanner input) {
		//first name or last name
		String lof;
		
		System.out.println("Please enter search criteria.");
		
		System.out.printf("Type (without quotations) 'f' for searching by first name or 'l' for searching by last name:");
		
		lof=input.nextLine();
		
		//prompts the user to input either "l" or "f"
		if(!lof.equalsIgnoreCase("f")&&!lof.equalsIgnoreCase("l")) {
					
			System.out.println("Unexpected input");
			System.out.println();
		}
		
		if(lof.equalsIgnoreCase("l")) {
			
			System.out.println("Enter the last name of the employee you are looking for");
			
			String name=input.nextLine();
			//for loop to match every manager employee with the user input.
			for(Management lastName:ManagementEmployee) {
				
				if (name.equalsIgnoreCase(lastName.getLastName())) {
				
					System.out.println(lastName.toString());
					
					break;
				}
			}
			//for loop to match every It Developer and It analyst employee with the user input.			
			for(Development lastName:DevelopmentEmployee) {
				
				if (name.equalsIgnoreCase(lastName.getLastName())) {
					
					System.out.println(lastName.toString());
					
					break;
				}
			}
			
			System.out.println();
		}
		
		if(lof.equalsIgnoreCase("f")) {
			
			System.out.println("Enter the first name of the employee you are looking for");
			
			String name=input.nextLine();
			
			for(Management firstName:ManagementEmployee) {
				
				if (name.equalsIgnoreCase(firstName.getFirstName())) {
				
					System.out.println(firstName.toString());
					
					break;
					
				}
			}

			
			for(Development firstName:DevelopmentEmployee) {
				
				if (name.equalsIgnoreCase(firstName.getFirstName())) {
					
					System.out.println(firstName.toString());
					break;
					
				}
			}
			
			System.out.println();
		}
		
		
	}
	

	
	public void promoteEmployee(Scanner input) {
		
		//temporary ArrayList to store the matched object;
		ArrayList<Development> deleteArrayList=new ArrayList<>();
		
		int managerId=0;
		
		//Management newManger=null;
		//Create a variable to store matched object.
		Development todeleted=null;
		//control variable 
		boolean isManagerId=false;
		//control variable
		boolean isEmployeeId=false;
		
		System.out.println("Only Managers are allowed to promote an employee. Please proved your employee ID");
		//catch the bad input.
		try {
			managerId=input.nextInt();
			
			input.nextLine();
			
		//Matching manager ID as per user's input.
		for(Management manager: ManagementEmployee) {
			//
			if(managerId==manager.getEmployeeID()) {
				//If matched turn control boolean variable to true;
				isManagerId=true;
				
				System.out.println("Enter the ID of the employee you want to promote");
				int employeeId=input.nextInt();
				//clear bad input.
				input.nextLine();
				
				//Searching according to employee ID.
				for(Development it:DevelopmentEmployee){
					
					 if(employeeId==it.getEmployeeID()){
						 
						//if matched turn boolean variable to true; 
						isEmployeeId=true;
						
						 //Store the matched object to a object variable "todeleted"
						 todeleted=it;

					   break;
					 }
				}
		//prompt user enter the correct Employee ID if the ID is not matched.		
		if(isEmployeeId==false) {		
			System.out.println("Employee ID is not correct");
			
			System.out.println();}
				
			} 
			
		}
		
		//handle wrong type of input.		
		}catch (Exception e) 
			{System.out.println("Please Enter number");
			//clear bad input.
				input.nextLine();
		}
		//catch if manager ID is not matched using control variable "isManagerId".
		try {
			//thrown a self-defined exception 
			if(isManagerId==false) throw new UnAuthorizedOperationException();
			
			}catch(UnAuthorizedOperationException e)
		
		{		   //print out error message.		
				System.err.printf("%s%n",e.getMessege());
				//defined Exception class name, 
				System.out.println(e.getClass().getSimpleName());
				//prompts user that the system going back to the main menu
				System.out.println("Returning to the main menu");
		
				}
		
		System.out.println();
		
		//if both control boolean variable is true,acquiring all necessary information of 
		//the promoted employee from Development database,Set it to new manager object.
		if(isManagerId&&isEmployeeId) {
		//create a manager object.	
		Manager newManager=new Manager();
		
		newManager.setEmployeeID(todeleted.getEmployeeID());
			
		newManager.setFirstName(todeleted.getFirstName());
			
		newManager.setLastName(todeleted.getLastName());
			
		newManager.setEmail(todeleted.getEmail());
			
		newManager.setYearlySalary(todeleted.getYearlySalary());
			
		String teamName="Management-training";
			
		newManager.setTeamName(teamName);
			
		String rank="Assistant Manager";
		
		newManager.setRank(rank);
		//add promoted employee to management account database.	
		ManagementEmployee.add(newManager);
	   
		//adding matched object to temporary ArrayList
		deleteArrayList.add(todeleted);
		
		//remove the promoted employee information from Development database.
		DevelopmentEmployee.removeAll(deleteArrayList);
		}
		
	}
	
	// remove Employee method
	public void removeEmployeee(Scanner input) {
		//Temporary ArrayList for storing matched employee.
		ArrayList<Development> firedEmployee=new ArrayList<>();
		
		int removeCount=0;
		
		int controlCount=1;
		
		int managerEmployeeID=0;
		
		int employeeId=0;
		
		boolean isFoundEmployee=false;
		
		boolean isFoundManager=false;
		
		Development toDeleted=null;
		
		System.out.println("Only Managers are allowed to remove an employee.Please provide your employee ID");
		
		//handle bad input for manager employee ID and ID of the employee to be removed.
		try {
			managerEmployeeID=input.nextInt();
			
			//input.nextLine();
			
			for(Management s:ManagementEmployee) {
				
		       if(managerEmployeeID==s.getEmployeeID()) {
		    	   
		    	   //control variable to verify if Manager Employee ID has been found.
		    	   isFoundManager=true;
		    	   
		    	   System.out.println("How many employees do you want to remove");
					
		    	   removeCount=input.nextInt();
		       		}		       
		       }
			try {
				if(!isFoundManager)throw new UnAuthorizedOperationException();
				
				}catch(UnAuthorizedOperationException e) {
					
			       //print out error message.		
					System.err.printf("%s%n",e.getMessege());
					//defined Exception class name, 
					System.out.println(e.getClass().getSimpleName());
					//prompts user that the system going back to the main menu
					System.out.println("Returning to the main menu");
					
					}
			
			}catch (Exception e) {
			
			
			System.out.println("UnExpected type of input");
			System.out.println("Returning to the main menu");
			
			}


			//if found manager ID ,proceed next step;
			if(isFoundManager){
				
				try {
					System.out.printf("Enter the ID of the employee %d to remove from the organization %n",controlCount);
			
					employeeId=input.nextInt();
			
					}catch (Exception e) {
						
						System.out.println("Unexpected type of input");}
				
			}
		
	

			//Use for loop to go through the employee object to match the employee ID with user's input.
			for(int i=0;i<removeCount;i++) {

			
			for(Development fire:DevelopmentEmployee) {
				
				if(employeeId==fire.getEmployeeID()) {
					//if matched , store object in to a Employee object variable
					toDeleted=fire;
					
					controlCount++;
					//boolean variable to make a decision.
					isFoundEmployee=true;
						}
				
					}
			
				}	
		
			
			if(isFoundEmployee) {
				//adding matched employee to an temporary AraayList,
				//because it can manipulate the object in enhanced for loop.
				firedEmployee.add(toDeleted);
				
				//prompt user how many employee have been deleted.
				System.out.printf("%d employees have been removed from the system.%n",controlCount-1);
				
			}
			//clear bad input.
			input.nextLine();

		//remove employee from arrayList
		DevelopmentEmployee.removeAll(firedEmployee);
		
		//prompts the user how many employee have been removed.
		
		
		System.out.println();
	}
	
	//Let user can update the email because employee email can be changed sometimes.
	public void updateEmployeeId(Scanner input) {
			
		boolean matchedId=false;
		
		boolean employeeMatched=false;
		
		try {
		
			System.out.println("Only manager can update employee ID, please provide Manager's employee Id");
			
			int employeeId=0;
			
			int managerId=input.nextInt();
			
			for (Management update:ManagementEmployee) {
			
				if (managerId==update.employeeID) {
					
					 matchedId=true;
					
					System.out.println("Please enter the employee ID you want to update");
					
					employeeId=input.nextInt();
					
					for (Development s:DevelopmentEmployee) {
						
						if(employeeId==s.employeeID) {
							
							employeeMatched=true;
							
							System.out.println("Please enter the new ID");
							
							int newId=input.nextInt();
							
							s.setEmployeeID(newId);
							
						}
						
					}
					
				}
			
			}
			//handle if user input not-Exist employee ID;
			if(!employeeMatched) {
				
				//prompts user to correct manager employee ID
				System.out.println("No such employee ID");
				
			}
				
				}catch (Exception e) {
			
					System.out.println("Unexpected type of input");
					
					//System.out.println();
					
				}
		
		//consume the bad input.
		input.nextLine();
		
		//catch the id that not matched in the manager database,throw a exception.
		try {if(!matchedId) throw new UnAuthorizedOperationException();
		
			}catch(UnAuthorizedOperationException e){
				
				//print out error message.		
				System.err.printf("%s%n",e.getMessege());
				//defined Exception class name, 
				System.out.println(e.getClass().getSimpleName());
				//prompts user that the system going back to the main menu
				System.out.println("Returning to the main menu");
				
				System.out.println();
			} 
		
		}
	
	}
	

