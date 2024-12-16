/*
 *	Author:Joshua Lee
 *  Date:10/13/24
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int A){
	
    int B = A - 1;
    boolean primenum = true;
    boolean notprime = false;
    
    while(B > 1){
    if((A % B) == 0){
        return false;
    }
    B = B - 1;
    }
    return true;
    }
    
    
    public static void printPrimes(int C){
    while(C > 1){
    if(checkPrime(C) == true){
        System.out.println(C);
    }
    else{
        System.out.print("none");
    }
    	C = C - 1;
        }
    }
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer and I will print out every prime number until that number: ");
    int primes = sc.nextInt();
    printPrimes(primes);
	}
}
