/*
 *	Author:  Joshua Lee
 *  Date: 10/11/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
public static int pow(int x, int y){
	int counter = 0;
	int num = 1;
	while(counter < y){
		num = num*x;
		counter++;
	}
	return num;
}

	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
System.out.println("what is your base number: ");
int x = sc.nextInt();
System.out.println("What is your exponent number: ");
int y = sc.nextInt();
System.out.println("Your answer is " + pow(x,y));
	}
}
