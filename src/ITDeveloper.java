/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Manipulating different properties between IT Analyst IT Developer,
 *  such as area Programming PlatForm and Designation;
 * */

import java.util.Scanner;

public class ITDeveloper extends Development {
	
	protected String designation="IT Developer";
	
	protected String programmingPlatForm;
	
	//no arguments constructor
	public ITDeveloper() {
		
	}
	
	public String toString() {
		
		return super.toString()+String.format(" | Designation:%2s | Programming PlatForm:%2s",designation,programmingPlatForm);
	}
	
	public void addEmployee(Scanner input) {
		//call super class method
		super.addEmployee(input);
		
		System.out.print("Enter the programming platform of the IT Developer: ");
		programmingPlatForm=input.nextLine();
		
		System.out.println();
		
	}

}
