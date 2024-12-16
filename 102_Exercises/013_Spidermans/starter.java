/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Spiderman bob = new Spiderman();
	Spiderman andrew = new Spiderman("Andrew Garfield",40,"Green Goblin");
	Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Electro");
	Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
	Spiderman josh = new Spiderman("Joshua",16,"spiderman");
	
	andrew.fight();
	tobey.fight();
	tom.fight();
	josh.fight();
	
		
	}
}
