/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	int [] arr = new int [1001];
	int i = 0;
	int lee = i + 1;
	while (i<1000){
		int num = i * 3;
		arr[lee] = num;
		System.out.println("count: " + lee + " value: " + arr[lee]);
		i++;
		lee++;
	}
	
	
	int [] arr2 = new int [1001];
	int z = 0; 
	while(z < arr.length){
		arr2[z] = arr2.length - 1 - z;
		System.out.println("index: " + z + " value: " + arr[z]);
		z++;
	}
	
	
	
	
	
	
	
	
	}
}
