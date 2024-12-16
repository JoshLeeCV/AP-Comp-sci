/*
 *	Author: Joshua Lee
 *  Date: 11/10/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("--------------------------------------------------");
		int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1; 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("--------------------------------------------------");
        
        int target = (int)(Math.random() * 10) + 1; 
        System.out.println("Target number: " + target);
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
            	System.out.println("Duplicates found at the index: ");
                System.out.println(i + " ");
                count = count + 1;
            }
        }
        System.out.println("Total duplicates: " + count);
        System.out.println("--------------------------------------------------");
        
        boolean consecutive = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Consecutive duplicates found at index " + i + " and " + (i + 1) + " with the value: " + arr[i]);
            }
        }
        if (consecutive == false) {
            System.out.println("No consecutive duplicates found.");
        }
        System.out.println("--------------------------------------------------");
        
	}
}
