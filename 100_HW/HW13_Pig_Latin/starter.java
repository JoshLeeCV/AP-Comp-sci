/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*; 
class starter { 
	public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in); 

    System.out.println("Please enter a sentence, we will translate your sentence into Pig Latin for you: ");
    String sent = sc.nextLine(); 
    String sent2 = (sent+" ");
    int c = 0; 
    String result = " "; 
    for(int i = 0; i < sent2.length(); i++){ 
        if(sent2.substring(i, i+1).equals(" ")){ 
		String word = sent2.substring(c, i); result += pigLatin(word) + " "; c = i + 1; 
        }
    }
    System.out.println("Sentence in Pig Latin:"); 
    System.out.println(result); 
    } 
    private static String pigLatin(String a){ 
    if (a.length() == 1 ){
		return a + "- way"; 
        }
        
    String one = a.substring(0, 1); 
    String two = a.substring(1, 2); 
    
    if (isVowel(one)){
        return a + "- way"; 
    }
    else{ 
    	if (isVowel(two)){ return a.substring(1) + "-" + a.substring(0, 1) + " ay"; 
		}
    	else{
        	return a.substring(2) + "-" + a.substring(0, 2) + " ay"; 
    	} 
    } 
    } 
    private static boolean isVowel(String letter){ 
    return letter.contains("a") ||  letter.contains("e") ||  letter.contains("i") ||  letter.contains("o") ||  letter.contains("u") || letter.contains("A") ||  letter.contains("E") ||  letter.contains("I") ||  letter.contains("O")|| letter.contains("U"); 
        } 
    }
