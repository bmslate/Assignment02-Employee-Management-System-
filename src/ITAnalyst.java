/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Manipulating different properties between IT Analyst IT Developer,
 *  such as area analysis and Designation;
 * */

import java.util.Scanner;

public class ITAnalyst extends Development{
	
	protected String designation="IT Analyst";
	
	protected String area;
	
	//no arguments constructor
	public ITAnalyst() {
		
	}
	
	public String toString() {
		
		return super.toString()+String.format(" | Designation:%2s | Area of analysis:%2s",designation,area);
	}
	
	public void addEmployee(Scanner input) {
		//calling the super class method
		super.addEmployee(input);
		
		System.out.print("Enter the area of analysist of the IT Analyst: ");
		area=input.nextLine();
		
		System.out.println();

}
}