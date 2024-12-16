/*
 *	Author:  Joshua Lee
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
// Your code goes below here
Scanner sc = new Scanner(System.in);
myCharacter joshua = new myCharacter();
joshua.characterStats();
System.out.println();
System.out.println("Would you like to be a Wizard, Warrior, or Rogue?: ");
String ans = sc.nextLine();
myCharacter joshuaL = new myCharacter(ans);
System.out.println();
joshuaL.characterStats();


}
}