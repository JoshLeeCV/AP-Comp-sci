/*
 *	Author:  Joshua Lee
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name: ");
	String name = sc.nextLine();
	
	System.out.println("What is your title? Ex: Slayer of Dragons");
	String title = sc.nextLine();
	
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
	String role = sc.nextLine();
	if(role.equals("Wizard")||role.equals("wizard"))
	{
		System.out.print("You have chosen the Wizard! Excellent!");
	}
	else if(role.equals("Warrior")||role.equals("warrior"))
	{
		System.out.print("You have chose the Warrior! Excellent!");
	}
	else if (role.equals("Rogue")||role.equals("rogue"))
	{
		System.out.print("You have chose the Rogue! Excellent");
	}
	
	System.out.println();
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	
System.out.println();
		
	System.out.print("Strength (1-10): ");
	int strength = sc.nextInt();
	if(strength > 10){
		System.out.println("please enter a smaller integer");
		strength = sc.nextInt();
	}		
	else if(strength < 0){
		System.out.println("please enter a larger integer");
		strength = sc.nextInt();
	}
	int new1 = 20-strength;
	System.out.println("You have " + new1 + " skill points left!");
		
	System.out.println();
	
	System.out.print("Speed (1-10): ");
	int speed = sc.nextInt();
	if(speed > 10){
		System.out.println("please enter a smaller integer");
		speed = sc.nextInt();
	}		
	else if(speed < 0){
		System.out.println("please enter a larger integer");
		speed = sc.nextInt();
	}
	if(speed > new1){
		System.out.println("you do not have that many point please enter a smaller integer");
		speed = sc.nextInt();
	}
	int new2 = new1-speed;
	System.out.println("You have " + new2 + " skill points left!");
		
	System.out.println();
		
	System.out.print("Intelligence (1-10): ");
	int intelligence = sc.nextInt();
	if(intelligence > 10){
		System.out.println("please enter a smaller integer");
		intelligence = sc.nextInt();
	}		
	else if(intelligence < 0){
		System.out.println("please enter a larger integer");
		intelligence = sc.nextInt();
	}
	if(intelligence > new2){
		System.out.println("you do not have that many point please enter a smaller integer");
		intelligence = sc.nextInt();
	}
	int new3 = new2-intelligence;
	System.out.println("You have " + new3 + " skill points left!");
		
	System.out.println();
		
	System.out.print("Charisma (1-10): ");
	int Charisma = sc.nextInt();
	if(Charisma > 10){
		System.out.println("please enter a smaller integer");
		Charisma = sc.nextInt();
	}		
	else if(Charisma < 0){
		System.out.println("please enter a larger integer");
		Charisma = sc.nextInt();
	}
	if(Charisma > new3){
		System.out.println("you do not have that many point please enter a smaller integer");
		Charisma = sc.nextInt();
	}
		
	System.out.println();
	System.out.println("-------------------------------------------------------------");
	System.out.println();
		
	System.out.println("You are " + name + ", " + "the " + title);
	System.out.println("You are a " + role + " with these stats!!!");
	System.out.println("Strength: " + strength);
	System.out.println("Speed: " + speed);
	System.out.println("Intelligence: " + intelligence);
	System.out.println("Charisma: " + Charisma);
	System.out.println();
	System.out.println("Good luck on your adventure, " + title + "!!!");
		
		
	
		
		
	}
}
