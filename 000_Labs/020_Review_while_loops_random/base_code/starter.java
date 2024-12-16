/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("Please print a number from 1-1000");
int secret = ((int)(Math.random()*1000)+1);

while(true){
	int guess = sc.nextInt();
	if(guess==secret){
		System.out.println("You got the secret number!");
	}
	else if(guess>secret){
		System.out.println("Your number is to high!");
		System.out.println("guess a number: ");
	}
	else if(guess<secret){
		System.out.println("Your number is to low!");
		System.out.println("guess a number");
	}
}













		
	}
}
