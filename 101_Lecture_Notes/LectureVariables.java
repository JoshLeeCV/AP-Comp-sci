/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        String name; 
        name= new String("Joshua");
        String name2 = new String("Joe");
        
        int num;
        num = 31;
        
        double money;
        money = 45.79;
        
        System.out.println(name + " lives in Tennessee!");
        System.out.println(name + " has " + num + " pets.");
        System.out.print(name + " has $" + money + " to feed his pets.");
	}
}