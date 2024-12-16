/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        boolean x = true;
        boolean y = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Number PLease");
        int num = sc.nextInt();
        
        if(num>10){
            System.out.println("Your number bigger than 10");
        }
	}
}