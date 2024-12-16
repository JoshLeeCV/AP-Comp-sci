/*
 *	Author:  Joshua Lee
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your first number: ");
	int number = sc.nextInt();
	System.out.println();
	
	System.out.print("Please enter your second number: ");
	int number2 = sc.nextInt();
	System.out.println();
	
	if(number==number2)
	{
	System.out.println("Your variables are the same");
	}
	else{
	System.out.print("Your variables are different");
	}
	}
}
