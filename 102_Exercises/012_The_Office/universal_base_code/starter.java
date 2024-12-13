/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		pam.employeeToString();
		Employee bob = new Employee(1473, "Bob", "Bobington", 5741.49);
		bob.employeeToString();
		System.out.println("Today, everyone gets a raise! :D");
		System.out.println("Michael got a raise of 28%.");
		michael.raiseSalary(28);
		System.out.println("Dwight got a raise of 25%.");
		dwight.raiseSalary(25);
		System.out.println("Jim got a raise of 21%.");
		jim.raiseSalary(21);
		System.out.println("Pam got a raise of 23%.");
		pam.raiseSalary(23);
		System.out.println("Bob got a raise of 29%.");
		bob.raiseSalary(29);
		System.out.println("Michael's salary: $" + michael.getSalary() + ". Michael's annual salary: $" + michael.getAnnualSalary() + ".");
		System.out.println("Dwight's salary: $" + dwight.getSalary() + ". Dwight's annual salary: $" + dwight.getAnnualSalary() + ".");
		System.out.println("Jim's salary: $" + jim.getSalary() + ". Jim's annual salary: $" + jim.getAnnualSalary() + ".");
		System.out.println("Pam's salary: $" + pam.getSalary() + ". Pam's annual salary: $" + pam.getAnnualSalary() + ".");
		System.out.println("Bob's salary: $" + bob.getSalary() + ". Bob's annual salary: $" + bob.getAnnualSalary() + ".");
	}
}
