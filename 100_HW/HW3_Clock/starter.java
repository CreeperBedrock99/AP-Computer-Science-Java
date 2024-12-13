/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it today? 0 = Sun, 1 = Mon, 2 = Tues, 3 = Wed, 4 = Thur, 5 = Fri, 6 = Sat ");
		int day = sc.nextInt();
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5){
			System.out.print("Alarm set for 7 am.");
		}else if (day == 0 || day == 6){
			System.out.print("Alarm set for 10 am.");
		}else{
			System.out.print("Invalid input");
		}
	}
}
