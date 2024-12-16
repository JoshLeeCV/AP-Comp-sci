/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        greeting("Edward");
        greeting("josh");
        greeting("spongebob");
        
        
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        double pay = raiseSalary(1000.42, 14);
        System.out.println(pay);
	}
	
	public static void greeting(String name){
	    System.out.println("Howdy "+ name);
	}
	
    public static double raiseSalary(double salary, int percent){
        double raisedSalary = salary + (salary * (percent/100.0));
        return raisedSalary;
    }
	
	
	public static void printAnimal(){
	    System.out.println(" /~\\");
	    System.out.println(" C oo");
	    System.out.println("_( ^)");
	    System.out.println("/   ~\\");
	}
	
	
	
}