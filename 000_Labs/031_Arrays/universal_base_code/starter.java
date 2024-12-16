/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int [] arr2 = new int [11];
	int z = 0; 
	while(z < arr2.length){
		arr2[z] = arr2.length - 1 - z;
		System.out.println("index: " + z + " value: " + arr2[z]);
		z++;
	}
		
	}
}
