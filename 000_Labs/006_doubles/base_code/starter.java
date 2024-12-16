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
		System.out.println("Please enter the temperature number in Fahrenheit:");
	    double number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("This is the conversion to celsius");
		System.out.println((number - 32)*5/9);
		
	}
}
