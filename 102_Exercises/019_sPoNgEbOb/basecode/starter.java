/*
	Author: josh lee
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word/phrase: ");
	String word = sc.nextLine();
	System.out.println();
	System.out.println("Your word/phrase as sPoNgE cAsE: ");
	
	for(int i = 0; i<word.length(); i++){
		String letter = word.substring(i, i+1);
		if(i%2==0){
			String upper = letter.toUpperCase();
			System.out.print(upper);
		}
		if(i%2==1){
			String lower = letter.toLowerCase();
			System.out.print(lower);
		}
		
	}
	
	
	}
}
