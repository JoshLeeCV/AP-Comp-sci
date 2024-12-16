import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		
		for(int a = 0; a < passwords.length; a++){
		
		String word = passwords[a];
		boolean s1wrong = false;
		boolean s2wrong = false;
		if (word.length() >= 8){
		    s1++;
		    s1wrong = true;
		}
		if(word.contains("!")|| word.contains("@")|| word.contains("#")|| word.contains("$")|| word.contains("%")|| word.contains("^")|| word.contains("&")|| word.contains("*")){
		    s2++;
		    s2wrong = true;
		}
		if(s1wrong == true && s2wrong == true){
		    s3++;
		    }
		}
		System.out.println("Strength 1: " + s1);
		System.out.println("Strength 2: " + s2);
		System.out.println("Strength 3: " + s3);
		
	}
}
