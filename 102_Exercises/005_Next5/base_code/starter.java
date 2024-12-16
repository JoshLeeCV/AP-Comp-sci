/*
 *	Author:Joshua Lee
 *  Date:9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
	    int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Here are the next 5 numbers!");
		System.out.println((number+1) + "," + (number+2) + "," +(number+3) + "," + (number+4) + "," + (number+5));
		
		System.out.println("Here are the next 5 multiples of " + number);
		System.out.println((number+5) + "," + (number+10) + "," +(number+15) + "," + (number+20) + "," + (number+20));
		
		System.out.println("Here is " + number +" divided by 100");
		System.out.println(number/100.0);
		
		System.out.println("Here is " + number + " divided by 10");
		System.out.println(number/10.0);

	}
}
