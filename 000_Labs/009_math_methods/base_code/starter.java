/*
 *	Author:  Joshua Lee
 *  Date: 9/13/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println(Math.max(13-6*11, 30%7*(-2)));
	
	System.out.println(Math.sqrt(3*8+31%7));
	
	System.out.println(Math.pow(37/3,35%21));
	
	System.out.println(Math.max(Math.pow(3,14%3),Math.sqrt(2*6)));
	
	System.out.println("please enter a double number: ");
	double number = sc.nextDouble();
	
	System.out.println("please enter another double number");
	double number2 = sc.nextDouble();
	
	System.out.println((("maximum number of x and y is ") + (Math.max (number,number2))));
	System.out.println((("square root is y is ") + (Math.sqrt (number2))));
	System.out.print((("power of x and y is ") + (Math.pow (number,number2))));
	
	
	}
}
