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
		System.out.println("Please enter a sentence");
		String sent = sc.nextLine();
		String a = "";
		while(true){
			if(sent.indexOf(" ") == -1){
				System.out.print(sent + " ");
				break;
			}
			int space = sent.indexOf(" ");
			String b = sent.substring(0,space);
			a = b + " " + a;
			sent = sent.substring(space + 1);
		}
		System.out.println(a);
		


		
	}
}
