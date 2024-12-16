/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
myCharacter characterjosh = new myCharacter("there is no role");
characterjosh.myToString();

System.out.println("what class would you like to be?(wizard,rogue,warrior");
String role1 = sc.nextLine();
myCharacter characterlee = new myCharacter(role1);
	if(characterlee.setAll(role1, 10,10,10,10)){
		characterlee.myToString();
    }
    else{
        System.out.println("its not greater than 0");
    }

	}
}
