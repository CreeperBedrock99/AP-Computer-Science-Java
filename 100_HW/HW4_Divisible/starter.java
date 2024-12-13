/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("please enter another number: ");
		int num2 = sc.nextInt();
		if (num1 % 2 == 0){
			System.out.println("Your first number is even;");
		}else{
			System.out.println("Your first number is odd;");
		}
		if (num2 % 2 == 0){
			System.out.println("Your second number is even;");
		}else{
			System.out.println("Your second number is odd;");
		}
		if (num1 % 3 == 0){
			if(num1 % 4 == 0){
				if(num1 % 5 == 0){
					System.out.println("Your first number is divisible by 3, 4 and 5.");
				}else if (num1 % 5 != 0){
					System.out.println("Your first number is divisible by 3 and 4.");
				}
			}else if (num1 % 4 != 0){
				if(num1 % 5 == 0){
					System.out.println("Your first number is divisible by 3 and 5.");
				}else if (num1 % 5 != 0){
					System.out.println("Your first number is divisible by 3.");
				}
			}
		}else if (num1 % 3 != 0){
			if(num1 % 4 == 0){
				if(num1 % 5 == 0){
					System.out.println("Your first number is divisible by 4 and 5.");
				}else if (num1 % 5 != 0){
					System.out.println("Your first number is divisible by 4.");
				}
			}else if (num1 % 4 != 0){
				if(num1 % 5 == 0){
					System.out.println("Your first number is divisible by 5.");
				}else if (num1 % 5 != 0){
					System.out.println("Your first number is not divisible by 3, 4 or 5.");
				}
			}
		}
		if (num2 % 3 == 0){
			if(num2 % 4 == 0){
				if(num2 % 5 == 0){
					System.out.println("Your second number is divisible by 3, 4 and 5.");
				}else if (num2 % 5 != 0){
					System.out.println("Your second number is divisible by 3 and 4.");
				}
			}else if (num2 % 4 != 0){
				if(num2 % 5 == 0){
					System.out.println("Your second number is divisible by 3 and 5.");
				}else if (num2 % 5 != 0){
					System.out.println("Your second number is divisible by 3.");
				}
			}
		}else if (num2 % 3 != 0){
			if(num2 % 4 == 0){
				if(num2 % 5 == 0){
					System.out.println("Your second number is divisible by 4 and 5.");
				}else if (num2 % 5 != 0){
					System.out.println("Your second number is divisible by 4.");
				}
			}else if (num2 % 4 != 0){
				if(num2 % 5 == 0){
					System.out.println("Your second number is divisible by 5.");
				}else if (num2 % 5 != 0){
					System.out.println("Your second number is not divisible by 3, 4 or 5.");
				}
			}
		}
	}
}
