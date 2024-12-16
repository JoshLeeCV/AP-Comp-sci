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
		System.out.println("Enter a word");
		String word = sc.nextLine();
		
		System.out.println("Letter by letter:"); 
		
		for (int i = 0; i < word.length() ; i++){
			String A = word.substring(i,i + 1);
			System.out.println(A);
		}

		
	}
}
