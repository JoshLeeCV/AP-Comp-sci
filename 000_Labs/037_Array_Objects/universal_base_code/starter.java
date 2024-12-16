/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Wizard[] wiz =new Wizard [100];
		Warrior [] war = new Warrior [100];
		for(int i = 0; i < war.length; i++){
			wiz[i] = new Wizard();
		}
		for(int i = 0; i < war.length; i++){
			war[i] = new Warrior();
		}
		
		int wizardDeath = 0;
		int warriorDeath = 0;
		int warcounter = 0;
		int wizcounter = 0;
		while(wizardDeath < 100 && warriorDeath < 100){
			wiz[wizardDeath].attack(war[warriorDeath]);
			war[warriorDeath].attack(wiz[wizardDeath]);
			if (war[warriorDeath].isDead()){
				warriorDeath++;
				warcounter ++;
			}
			else if(wiz[wizardDeath].isDead()){
				wizardDeath++;
				wizcounter ++;
			}
		}
		
		if(wizardDeath < 100){
			System.out.println("The WIZARDS WON THE WAR!!! They won with " + (100 - wizcounter) + " Wizards remaining!");
		}
		else{
			System.out.println("The WARRIORS WON THE WAR!!! They won with " + (100 - warcounter) + " Warriors remaining!");
		}
		

	}
}
