/*
 *	Author:Joshua lee
 *  Date:9/22
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter what day it is(0-6): ");
	int number = sc.nextInt();
	System.out.println();
	
	if(number == 0 || number == 6)
	{
		System.out.print("it's a weekend! wake up at 10 am!");
	}
	
	else if(number > 6 || number < 0)
	{
		System.out.print("Your number does not exist");
	}
	else
	{
		System.out.print("It's a weekday! wake up at 7am!");
	}
	}
	}
