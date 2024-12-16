/*
 *	Author:  Joshua Lee
 *  Date: 10/1/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a name: ");
String name = sc.nextLine();


System.out.println("how many times would you like this name to be printed out: ");
int count = sc.nextInt();
System.out.println();
int c = 0;

while(true){
	System.out.println(name);
	if(c==count){
		break;
		}
	c=c + 1;
}



		
	}
}
