/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = sc.nextLine();
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("What month were you born in? ");
		String month = sc.nextLine();
		System.out.print("What day of "+month+" were you born on? ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.print("What year were you born in? ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("How much is a buck fifty? ");
		double money = sc.nextDouble();
		System.out.println("Summary of your input: Your name is "+name+" and you are "+age+" years old.");
		System.out.println("You were born on "+month+" "+day+", "+year+".");
		System.out.print("A buck fifty is $"+money+"0.");
	}
}
