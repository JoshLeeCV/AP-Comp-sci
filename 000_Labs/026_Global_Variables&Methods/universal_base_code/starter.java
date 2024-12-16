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
		myCharacter test = new myCharacter();
		System.out.print("Choose your role: ");
		String answer = sc.nextLine();
		myCharacter josh = new myCharacter();
		System.out.println();
		josh.myToString();

		
	}
}
