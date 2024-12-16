/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String str){
		System.out.println(str);
	}
	public static void toStringCombined(String str, String str2){
		System.out.println(str + " " + str2);
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("write a sentence");
	String sent = sc.nextLine();
	System.out.println("write a sentence");
	String sent2 = sc.nextLine();
	
	System.out.println("This is the method");
	toString(sent);
	toStringCombined(sent,sent2);
		
	}
	
}
