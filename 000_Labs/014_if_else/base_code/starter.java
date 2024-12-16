/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number that ranges from 1-1000: ");
	int number = sc.nextInt();
	System.out.println();
	
	int x = (int)(Math.random()*999)+1;
	
	if(number == x)
	{
		System.out.print("You chose the same number as me! The number was " + x);
	}
	else if(number != x);
	{
		System.out.print("The number wasn't the random number. The number was " + x);
	}
	
	
	
	}
}
