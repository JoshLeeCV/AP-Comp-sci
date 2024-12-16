/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	int str;
    int dex;
    int intel;
    int charisma;
    String role;
public myCharacter(String a){
    role = a;
    str = 0;
	dex= 0;
    intel = 0;
    charisma = 0;
    }
public myCharacter(String role,int s, int d, int i, int ch){
    role = role;
    str =s;
    dex= d;
    intel = i;
    charisma = ch;
    }
public String setRole(String a){
        if(a.equals("Warrior") || (a.equals("Wizard") || (a.equals("Rouge")))){
            return a;
            }
        else{
            System.out.print("no rule? rerun it");
        return a;
            }
     }
public int setStr(int s){
        return str;
        }
public int setDex(int d){
        return dex;
        }
public int setInt(int i){
        return intel;
        }
public int setChar(int ch){
        return charisma;
    	}
    public boolean setAll(String role, int s, int d, int i, int ch){
        this.role=role;
        str =s;
        dex=d;
        intel = i;
        charisma = ch;
            if(role.equals("Warrior") || (role.equals("Wizard") || (role.equals("Rogue"))) && str> 0 && dex >0 && intel > 0 && charisma > 0){
                return true;
            }
            else{
                return false;
            }
        }
    public void myToString(){
    System.out.println("--------------------------------------------------");
    System.out.println("Your ROLE is: " + role);
    System.out.println("Strength stat: "  + str);
    System.out.println("Dexterity stat: "  + dex);
    System.out.println("Intelligence stat: " + intel);
    System.out.println("Charisma stat: " + charisma);
    System.out.println("-------------------------------------------------");
    System.out.println("");
        }

}
