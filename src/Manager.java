/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: manager object 
 * */

import java.util.Scanner;
public class Manager extends Management{
	
	protected String rank;
	
	//no arguments constructor
	public Manager() {
		
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank=rank;
	}
	
	public String toString() {
		
		return super.toString()+String.format(" | Rank: %s%n",rank);
	}
	
	public void addEmployee(Scanner input) {
		//call super class method
		super.addEmployee(input);
		
		System.out.print("Enter the rank of Manager: ");
		
		rank=input.nextLine();
		
		System.out.println();

	}

}
