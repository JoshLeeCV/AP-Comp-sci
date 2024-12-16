/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int str;
	int dex;
	int intel;
	int charisma;

	public myCharacter() {
		String role;
		int str = 0;
		int dex = 0;
		int intel = 0;
		int charisma = 0;
	}
	
		public myCharacter(String lee){
	    if(lee.equals("wizard") || lee.equals("Wizard")){
	System.out.println("you've chosen the Wizard! Excelsior!");
	role = lee;
	}
	else if(lee.equals("rogue") || lee.equals("Rogue")){
	System.out.println("you've chosen the Rogue! How cunning!");
	role = lee;
	}
	else if(lee.equals("warrior") || lee.equals("Warrior")){
	System.out.println("you've chosen the Warrior! For honor!");
	role = lee;
	}
	else{
	System.out.println("Thats not a real role");
	role = new String("No role");
	}
	    }
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength stats is " + str);
		System.out.println("Your dexterity stats is " + dex);
		System.out.println("Your intelligence stats is " + intel);
		System.out.println("Your charisma stats is " + charisma);
	}

}

