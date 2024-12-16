/*
 *	Author:  Joshua Lee
 *  Date: 9/19/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("A integer between 0 - 9: ");
		System.out.println((int)(Math.random()*9 + 1));
		
		System.out.print("A integer between 1 -100: ");
		System.out.println((int)(Math.random()*99 + 1));
		
		System.out.print("A double between 2.5 and 3.5: ");
		System.out.println((Math.random()*1.0 + 2.5));
		
		System.out.print("A double between 14 and 589: ");
		System.out.print((Math.random()*575 + 14));
		
		
	}
}
