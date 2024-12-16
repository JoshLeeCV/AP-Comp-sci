/*
 *	Author: Joshua Lee
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();
		
		Employee Pam = new Employee(2011,"Pam", "Beesly", 2250);
		Pam.employeeToString();
		
		Employee Josh = new Employee(7476, "Josh", "Lee", 1000000);
		Josh.employeeToString();
		
		System.out.println("Annual Salaries of all employees + yearly salary:");
		michael.raiseSalary(25);
		System.out.println("micael: $" + michael.getAnnualSalary());
		
		Dwight.raiseSalary(25);
		System.out.println("Dwight: $" + Dwight.getAnnualSalary());
		
		Jim.raiseSalary(10);
		System.out.println("Jim: $" + Jim.getAnnualSalary());
		
		Pam.raiseSalary(40);
		System.out.println("Pam: $" + Pam.getAnnualSalary());
		
		Josh.raiseSalary(1000);
		System.out.println("Josh: $" + Josh.getAnnualSalary());
		
	}
}
