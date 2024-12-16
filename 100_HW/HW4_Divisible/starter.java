/*
 *	Author:Joshua Lee
 *  Date:9/28
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a integer: ");
	int num = sc.nextInt();
	
	System.out.print("Please enter another integer: ");
	int num2 = sc.nextInt();
	
	
	if(num % 2 == 0){
		System.out.println(num + " is even");
	}
	else{
		System.out.println(num + " is odd");
	}
	if(num2 % 2 == 0){
		System.out.println(num2 + " is even");
	}
	else{
		System.out.println(num2 + " is odd");
	}
	
	
	if(num % 3 == 0&& num % 4 == 0&&num % 5 == 0){
		System.out.println(num + " is divisable by 3,4,5");
	}
	else{
		System.out.println(num + " is NOT Divisable by 3,4,5");
	}
	if(num2 % 3 == 0&& num2 % 4 == 0&& num2 % 5 == 0){
		System.out.println(num2 + " is divisable by 3,4,5");
	}
	else{
		System.out.println(num2 + " is NOT Divisable by 3,4,5");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
