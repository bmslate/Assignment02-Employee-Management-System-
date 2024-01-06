/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: Interface
 * */
import java.util.Scanner;
public interface Employee {
	
	public String toString();
	
	//passing a Scanner object into this method so that it only need create
	//a single Scanner object to finish this assignment.
	public void addEmployee(Scanner input);
	

}
