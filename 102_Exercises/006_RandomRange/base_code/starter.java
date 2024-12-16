/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to make your random number");
		System.out.println("Please enter an integer: ");
		int number = sc.nextInt();
		System.out.println("Please enter another integer(higher than the last");
		int number2 = sc.nextInt();
		
		System.out.println("Your range is " + number + " to " + number2 );
		System.out.print("Here are your 5 numbers generated in that range:");
		System.out.print(((int)(Math.random()*(number2-number))+number) + ",");
		System.out.print(((int)(Math.random()*(number2-number))+number) + ",");
		System.out.print(((int)(Math.random()*(number2-number))+number) + ",");
		System.out.print(((int)(Math.random()*(number2-number))+number) + ",");
		System.out.print(((int)(Math.random()*(number2-number))+number) + ",");
	}
}
