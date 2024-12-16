/*
 *	Author:  Joshua Lee
 *  Date: 9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number from 1-1000: ");
	int number = sc.nextInt();
	System.out.println();
	
	int x = (int)(Math.random()*999)+1;
	
	if(number==x)
	{
		System.out.print("Your number is equal to the random number!");
	}
	else if(number<x)
	{
		System.out.print("Your number is less than the random number");
	}
	else if(number>x)
	{
		System.out.print("Your number is greater than the random number");
	}
	
	}
}
