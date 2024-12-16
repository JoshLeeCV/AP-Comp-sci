/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Starter {
    public static void main(String[] args) {
        math = new MathClass();
        Scanner scanner = new Scanner(System.in);

        double balance = 100.0; // Starting money

        System.out.println("Welcome to the Casino! You start with $100.");

        while (balance > 0) {
            System.out.println("\nYour current balance: $" + balance);
            System.out.println("Choose an action:");
            System.out.println("1. Bet on a random number (win double your bet)");
            System.out.println("2. Guess the square root of a number (win triple your bet)");
            System.out.println("3. Bet on the higher number (win equal to your bet)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Random Number Game
                System.out.print("Enter your bet: $");
                double bet = scanner.nextDouble();
                if (bet > balance) {
                    System.out.println("Insufficient funds!");
                    continue;
                }

                double randomNum = math.random(1, 10); // Random number between 1 and 10
                System.out.println("Guess a number between 1 and 10: ");
                int guess = scanner.nextInt();

                if (guess == (int) randomNum) {
                    balance += bet * 2;
                    System.out.println("You guessed correctly! You win $" + (bet * 2));
                } else {
                    balance -= bet;
                    System.out.println("Wrong guess. The number was " + (int) randomNum);
                }
            } else if (choice == 2) {
                // Square Root Game
                System.out.print("Enter your bet: $");
                double bet = scanner.nextDouble();
                if (bet > balance) {
                    System.out.println("Insufficient funds!");
                    continue;
                }

                int randomSquare = (int) math.pow((int) math.random(1, 10), 2); // Random square
                System.out.println("Guess the square root of " + randomSquare + ": ");
                int guess = scanner.nextInt();

                if (guess == (int) math.sqrt(randomSquare)) {
                    balance += bet * 3;
                    System.out.println("Correct! You win $" + (bet * 3));
                } else {
                    balance -= bet;
                    System.out.println("Wrong guess. The correct answer was " + (int) math.sqrt(randomSquare));
                }
            } else if (choice == 3) {
                // Higher Number Game
                System.out.print("Enter your bet: $");
                double bet = scanner.nextDouble();
                if (bet > balance) {
                    System.out.println("Insufficient funds!");
                    continue;
                }

                int num1 = (int) math.random(1, 100);
                int num2 = (int) math.random(1, 100);
                System.out.println("Which is higher? 1: " + num1 + " or 2: " + num2);
                int guess = scanner.nextInt();

                if ((guess == 1 && num1 > num2) || (guess == 2 && num2 > num1)) {
                    balance += bet;
                    System.out.println("Correct! You win $" + bet);
                } else {
                    balance -= bet;
                    System.out.println("Wrong! The correct answer was " + (num1 > num2 ? num1 : num2));
                }
            } else if (choice == 4) {
                // Exit
                System.out.println("Thanks for playing! Your final balance: $" + balance);
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        if (balance <= 0) {
            System.out.println("You're out of money! Game over.");
        }

        scanner.close();
    }
}