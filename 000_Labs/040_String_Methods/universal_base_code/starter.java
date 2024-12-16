/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name (first and last) with a space in the middle: ");
		String name = sc.nextLine();
		int space1 = name.indexOf(" ");
		String SndWord = name.substring(space1);
		System.out.println("Your last name is: ");
		System.out.println(SndWord);
		
		

		
	}
}
