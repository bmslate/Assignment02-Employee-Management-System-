/*
 * Student Number:041121881
 * Student Name: Huijun Bu
 * Lab Professor: Professor Rejaul Chowdhury
 * Due Date: 21 Nov,2023
 * Modified: 17 Nov, 2023.
 * Description:
 *  Assignment 02: define a Exception class; create a method to print error message; 
 * */
public class UnAuthorizedOperationException extends Exception{
	//create a method to get wrong Message.
	public  String getMessege() {
		return ("You are NOT authorized to run this operation.");
	}

	
}
