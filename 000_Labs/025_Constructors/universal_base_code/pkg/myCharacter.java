/*
 *	Author:  Joshua Lee
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
String role;
int strength;
int speed;
int defence;
int intel;
int charisma;

public myCharacter(){
    role = new String ("No role");
    strength = 0;
    speed = 0;
    defence = 0;
    intel = 0;
    charisma = 0;
}
public myCharacter(String lee){
    if(lee.equals("wizard") || lee.equals("Wizard")){
System.out.println("you've chosen the Wizard! Excelsior!");
role = lee;
}
else if(lee.equals("rogue") || lee.equals("Rogue")){
System.out.println("you've chosen the Rogue! How cunning!");
role = lee;
}
else if(lee.equals("warrior") || lee.equals("Warrior")){
System.out.println("you've chosen the Warrior! For honor!");
role = lee;
}
else{
System.out.println("Thats not a real role");
role = new String("No role");
}
    }
public String getRole(){
    return role;
    }
public void characterStats(){
System.out.println("Your role is " + role);
System.out.println("Your strength stats is " + strength);
System.out.println("Your speed stats is " + speed);
System.out.println("Your defense stats is " + defence);
System.out.println("Your intelligence stats is " + intel);
System.out.println("Your charisma stats is " + charisma);
    }

}