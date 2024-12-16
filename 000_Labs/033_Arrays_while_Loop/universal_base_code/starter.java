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
		int arr [] = new int [1000];
		int ran;
		int a = 0;
		while (a < arr.length){
			ran = (int)(Math.random()*1000);
			arr[a] = ran;
			System.out.println(arr[a]);
			a++;
			
			
		}


		
	}
}
