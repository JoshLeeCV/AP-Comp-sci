/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dog name?: ");
        String Dogname1 = scanner.nextLine();
        System.out.print("What age should " + Dogname1 + " be?: ");
        int Dogage1 = scanner.nextInt();
        scanner.nextLine();
        Dog Dog1 = new Dog(Dogname1, Dogage1);

        Dog Dog2 = new Dog("Toto", "Cairn Terrier");

        System.out.println(Dog1.getName() + " is a " + Dog1.getBreed() + " that is " + Dog1.getAge() + " years old!");
        System.out.println(Dog2.getName() + " is a " + Dog2.getBreed() + " that is " + Dog2.getAge() + " years old!");

        if (Dog1.isSleeping()) {
            System.out.println(Dog1.getName() + " is asleep.");
        } else {
            System.out.println(Dog1.getName() + " is awake!");
            Dog1.bark();
        }
        if (!Dog1.isSleeping()) {
            System.out.println(Dog2.getName() + " wakes up from hearing " + Dog1.getName());
            Dog2.bark();
            }
        else {
            System.out.println(Dog2.getName() + " is awake!");
            if (!Dog1.isSleeping()) {
                Dog2.bark();
            }
        }
    }
}