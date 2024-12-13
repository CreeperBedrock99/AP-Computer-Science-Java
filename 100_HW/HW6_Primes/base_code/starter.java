/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num){
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void printPrime(int num){
		for (int i = 2; i < num; i++){
			if (checkPrime(i)){
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input an integer: ");
		int input = sc.nextInt();
		printPrime(input);
		if (checkPrime(input)){
			System.out.println(input + " is a prime number.");
		}else{
			System.out.println(input + " is not a prime number.");
		}
	}
}
