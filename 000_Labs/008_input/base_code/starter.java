/*
 *	Author:  Joshua Lee
 *  Date: 9/11/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String name = sc.nextLine();
		
		System.out.println("Please enter your age");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter what month you were born(1-12)");
		int num = sc.nextInt();
		
		System.out.println("please enter what day you were born");
		int number2 = sc.nextInt();
		
		System.out.println("Please enter what year you were born");
		int number3 = sc.nextInt();
		
		System.out.println("If I have a dollar plus fifty cents, How much money do I have");
		double number4 = sc.nextDouble();
		
		System.out.println("Your name is " + name + " and you are " + number + " years old.");
		
		System.out.println("You are born on " + num + "/" + number2 + "/" + number3);
		
		System.out.print("You have " + number4 + " dollars total");
		
	}
}
