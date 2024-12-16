/*
 *	Author:  Joshua Lee
 *  Date: 9/24
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
	
	System.out.print("Please enter your third number: ");
	int number3 = sc.nextInt();
	System.out.println();
	
	if(number>number2 && number>number3)
	{
		System.out.println("Your first number is the largest number");
		System.out.print("This is your biggest number: " + number);
	}
	else if(number2>number && number2>number3)
	{
		System.out.println("Your second number is the largest number");
		System.out.print("This is your biggest number: " + number2);
	}
	else
	{
		System.out.println("Your third number is the largest number");
		System.out.print("This is your biggest number: " + number3);
	}
	
	System.out.println();
	
	if(number<number2 && number<number3)
	{
		System.out.println("Your first number is the smallest number");
		System.out.print("This is your smallest number: " + number);
	}
	else if(number2<number && number2<number3)
	{
		System.out.println("Your second number is the smallest number");
		System.out.print("This is your smallest number: " + number2);
	}
	else
	{
		System.out.println("Your third number is the smallest number");
		System.out.print("This is your smallest number: " + number3);
	}
	}
}
