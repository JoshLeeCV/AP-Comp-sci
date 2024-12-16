/*
 *	Author:Joshua lee
 *  Date:10/6/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than or equal to your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	"+" a. If two numbers match, you double your money.");
		System.out.println("	"+" b. If three numbers match, you triple your money.");
		System.out.println("	"+" c. If none match, you lose your money.");
		System.out.println("-------------------------------------------------------------------------");
	
		int money = 100;
		int a = (int)(Math.random()*9+1);
		int b = (int)(Math.random()*9+1);
		int c = (int)(Math.random()*9+1);


		while(money != 0){
		System.out.print("Would you like to play ? Please input Yes/yes/Y/y: ");
		String play = sc.nextLine();
			if(play.equals("Yes") || play.equals("yes") || play.equals("Y") || play.equals("y")){
			System.out.print("You have $" + money + ", how much would you want to bet: ");
			int bet = sc.nextInt();
			if(bet > money){
			System.out.print("You do not have enough money to bet, enter a smaller amount!!: ");
			bet = sc.nextInt();
			}
			else if(bet <= 0){
			System.out.print("No negatives or 0!!! Enter a larger number!: ");
			bet = sc.nextInt();
			}
	
			System.out.println("Lets play!");
			System.out.println("Your rolls are:");
			System.out.println("______________________________________________________");
			System.out.println(" | " + a + " | " + b + " | " + c + " |");
			System.out.println("______________________________________________________");
	
			if((a == b && a != c && c != b)||(a == c && a != b && b != c)||(b == c && c != a && a!= b)){
			money = money + 2*bet - bet;
			System.out.println("WOO HOO YOU WON! YOUR BET HAS BEEN DOUBLED!");
			}
			if(a == c && a == b){
			money = money + 3*bet - bet;
			System.out.println("WOO HOO YOU WON! YOUR BET HAS BEEN TRIPLED!");
			}
			else if(a != c && a !=b && c != b){
			money = money-bet;
			System.out.println("SORRY YOU LOSE YOU LOST YOUR BET THAT WAS PLAYED!");
			}
			System.out.println("You now have $" + money + " leftover!");
			if(money == 0){
			System.out.println("Sorry you have 0 dollars. you can't play anymore.");
			break;
			}
			else if(play.equals("No")||play.equals("no")||play.equals("N")||play.equals("n")){
			System.out.println("You left with $" + money + ". See you next time!");
			break;
			}
			else{
			System.out.println("That is not a valid answer!!");
			}
		}

	}
}
}